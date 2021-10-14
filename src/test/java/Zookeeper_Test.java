import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Zookeeper_Test {
    private ZooKeeper zooKeeper;
    //需添加-Deditable.java.test.console=true
    Scanner sc = new Scanner(System.in);

    /**
     * 创建Zookeeper客户端连接
     */
    @Before
    public void before() throws IOException {
        zooKeeper = new ZooKeeper("192.168.128.129", 40000, new Watcher() {
            //执行成功回调方法和监听回调方法
            @Override
            public void process(WatchedEvent watchedEvent) {
                System.out.println("监听节点或数据变化时调用方法");
                System.out.println("监听事件类型：" + watchedEvent.getType());
                System.out.println("监听路径：" + watchedEvent.getPath());
                //默认只监听一次，如果要多次监听，执行完监听方法回调方法后在此设置
//                try {
//                    zooKeeper.getChildren("/", true);
//                } catch (KeeperException e) {
//                    e.printStackTrace();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        });
    }

    /**
     * 关闭连接
     */
    @After
    public void After() {
        try {
            zooKeeper.close();
            System.out.println("关闭连接！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 创建节点
     */
    @Test
    public void createNode() {
        try {
            System.out.println("请输入要创建的节点名称：");
            String node = sc.next();
            zooKeeper.create("/" + node, "提瓦特".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            System.out.println("创建节点：" + node);
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取指定路径节点数据，并设置监听
     */
    @Test
    public void getData() {
        try {
            System.out.println("请输入要获取的节点名称：");
            String node = sc.next();
            byte[] data = zooKeeper.getData("/" + node, true, null);
            System.out.print(node + "的节点数据：");
            System.out.println(new String(data));
            Thread.sleep(1000000);
            System.out.println("监听结束！");
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 修改节点数据
     */
    @Test
    public void setData() {
        try {
            System.out.println("请输入要修改的节点名称：");
            String node = sc.next();
            zooKeeper.setData("/" + node, "提瓦特大陆".getBytes(), -1);
            System.out.println(node + "节点已修改");
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取指定路径下的子节点，并监听
     */
    @Test
    public void getChildren() {
        try {
            List<String> children = zooKeeper.getChildren("/", true);
            System.out.println("子节点数据:");
            children.forEach(System.out::println);
            Thread.sleep(1000000);
            System.out.println("监听子节点结束");
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除节点
     */
    @Test
    public void deleteNode() {
        try {
            System.out.println("请输入要删除的节点名称：");
            String node = sc.next();
            zooKeeper.delete("/" + node, -1);
            System.out.println("节点" + node + "已删除");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }
    }

    /**
     * 判断节点是否存在，并监听该节点
     */
    @Test
    public void isExist() throws InterruptedException, KeeperException {
        System.out.println("请输入要查询的节点名称：");
        String node = sc.next();
        Stat stat = zooKeeper.exists("/" + node, true);
        System.out.println("Stat:" + stat);
        Thread.sleep(1000000);
    }
}

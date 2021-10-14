import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.*;

public class RedisTest {
    private Jedis jedis;
    Scanner sc = new Scanner(System.in);

    @Before
    public void getConnection() {
        try {
            jedis = new Jedis("192.168.128.128", 6379);
            jedis.auth("root");
            String ping = jedis.ping();
            System.out.println("Redis连接：" + ping);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("连接失败！");
        }
    }

    @After
    public void shutdown() {
        jedis.close();
        System.out.println("关闭Redis连接");
    }

    /**
     * 创建
     */
    @Test
    public void set() {
        jedis.set(sc.next(), sc.next());
    }

    /**
     * 获取
     */
    @Test
    public void get() {
        String s = jedis.get(sc.next());
        System.out.println("获取到的value：" + s);
    }

    /**
     * 将任意对象转为json数据格式字符串存储
     */
    @Test
    public void toJson() {
        String[] strs = new String[]{"rid", "角色", "武器"};
        Weapon weapon1 = new Weapon(1, "匣里龙吟");
        Weapon weapon2 = new Weapon(2, "黑剑");
        List<Weapon> list = new ArrayList<>();
        list.add(weapon1);
        list.add(weapon2);
        Set<Weapon> set = new HashSet<>();
        set.add(weapon1);
        set.add(weapon2);
        Map<String, Weapon> map = new HashMap<>();
        map.put("1", weapon1);
        map.put("2", weapon2);
        Role role = new Role(1, "刻晴", strs, weapon1, list, set, map);
        //转为json格式字符串
        String keqingJson = JSON.toJSONString(role);
        jedis.set("keqing", keqingJson);
        System.out.println("添加数据成功");
    }

    /**
     * 将json格式字符串转为任意对象
     */
    @Test
    public void toObject() {
        String keqing = jedis.get("keqing");
        Role role = JSON.parseObject(keqing, Role.class);
        System.out.println(role);
    }

}


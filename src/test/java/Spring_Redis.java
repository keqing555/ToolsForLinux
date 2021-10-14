import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class Spring_Redis {
    /**
     * Spring整合Redis
     */
    @Test
    public void spring_redis() {
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_redis.xml");
        //创建连接池
        JedisPool jedisPool = (JedisPool) context.getBean("jedisPool");
        //连接Redis
        Jedis jedis = jedisPool.getResource();
        System.out.println(jedis.ping());
        String keqing = jedis.get("keqing");
        Role role = JSON.parseObject(keqing, Role.class);
        System.out.println(role);
    }
}

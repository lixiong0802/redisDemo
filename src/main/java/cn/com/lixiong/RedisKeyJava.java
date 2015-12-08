package cn.com.lixiong;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2015/12/8 15:15
 * Desc:
 */
public class RedisKeyJava {
    public static void main(String[] args) {

        //连接本地的 Redis 服务
        Jedis jedis = new Jedis(AppConstant.REDIS_SERVER_IP);
        System.out.println("Connection to server sucessfully");

        // 获取数据并输出
        Set<String> list = jedis.keys("*");
        Iterator<String> interator = list.iterator();
        while (interator.hasNext()) {
            String value = interator.next();
            System.out.println("List of stored keys:: " + value);
        }
    }
}

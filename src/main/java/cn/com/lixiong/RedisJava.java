package cn.com.lixiong;

import redis.clients.jedis.Jedis;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2015/12/8 12:22
 * Desc:
 */
public class RedisJava {

    public static void main(String[] args) {

        //连接本地的 Redis 服务
        Jedis jedis = new Jedis(AppConstant.REDIS_SERVER_IP);
        System.out.println("Connection to server sucessfully");
        //查看服务是否运行
        System.out.println("Server is running: " + jedis.ping());

    }
}

package com.atguigu.java;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/*************************************************
                时间: 2020-12-20
                作者: 刘  辉
                描述: 
  ************************************************/
public class JedisTest {

    @Test
    public  void testJedis(){
        Jedis jedis = new Jedis("192.168.175.100", 6379);
        jedis.set("username", "张三");
        String username = jedis.get("username");

        System.out.println(username);
    }
}

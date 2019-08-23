package Utils;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * @auther mike
 * @create 2019-08-19 14:16
 */
@Service
public class RedisUtils {

        //不能通过new的方式获得jedis。
        private RedisUtils(){}


        private static RedisUtils Redis = null;
        private static Jedis jedis;
        private String isConnectedSuc = "";

        private static void setJedis(Jedis jedis) {
            RedisUtils.jedis = jedis;
        }


        //只有通过getRedis的方式获取jedis，使用了双重锁定的机制实现单例模式
        public static RedisUtils getRedis(){
            if(Redis == null){
                synchronized(RedisUtils.class){
                    if(Redis == null){
                        Redis = new RedisUtils();
                        try {
                            jedis = new Jedis("localhost",6379,10000);
                            Redis.setJedis(jedis);
                        }catch (Exception e){
                            System.out.println("报错了"+e.getMessage());
                        }finally {
                            return Redis;
                        }
                    }
                }
            }
            return Redis;
        }


        //测试redis是否连接成功
        public boolean isConnected(){
            boolean isOk = false;
            try{
                isConnectedSuc = jedis.ping();
                if("pong".equals(isConnectedSuc))
                    isOk = true;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                return isOk;
            }
        }



        //存
        public boolean setKey(String key,String value){
            boolean isOK = false;

            try{
                jedis.set(key,value);
                isOK = true;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                return isOK;
            }
        }

        //取
        public String getKey(String key){
            String value = "";
            try {
                value = jedis.get(key);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                return value;
            }
        }

        //关闭jedis的连接
        public boolean Close(){
            boolean isOk = false;
            try {
                jedis.close();
                isOk = true;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                return isOk;
            }
        }


        //存list
        public boolean setList(String key,String...Strings){
            boolean isOk = false;
            try {
                jedis.rpush(key,Strings);
                isOk = true;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                return isOk;
            }
        }

        //取list 0--100
        public List<String> getList(String key){
            List<String> list = null;
            try {
                list = jedis.lrange(key,0,100);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                return list;
            }
        }

        //get length of the list
        public long getListLength(String key){
             long res = -1;
            try {
                if(jedis.exists(key))
                    res = jedis.llen(key);

            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                return res;
            }
        }
}

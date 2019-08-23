import Utils.RedisUtils;
import com.zx.bananaSyS.pojo.role;
import org.junit.Test;

import java.util.List;

/**
 * @auther mike
 * @create 2019-08-19 15:00
 */
public class testRedis {

    @Test
    public void testRedis(){
        RedisUtils redisUtils = RedisUtils.getRedis();


        redisUtils.setList("name1","周鑫","周新");
        redisUtils.setList("name1","mike2");
        redisUtils.setList("name1","mike3");
        redisUtils.setList("name1","mike4");
        List<String> ss =redisUtils.getList("name1");
        System.out.println(ss);
    }
}

package Utils;

import org.junit.Test;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @auther mike
 * @create 2019-08-16 15:21
 */

@Service
public class MD5Util {


    public String getMD5String(String str) throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("MD5");

        md.update(str.getBytes());
        return new BigInteger(1,md.digest()).toString(16);
    }
}

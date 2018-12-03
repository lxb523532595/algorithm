package lixb.com.str;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * @author lixb
 * 2018/8/9 上午10:19
 */
public class UrlTest {
    public static void main(String[] args) {
        String url = "/3rdOauth/wxa7f436db560a17a3/callback%5D%5BIP=114.55.18.170%5D";
        try {
            url = URLDecoder.decode(url,"utf-8");
            System.out.println(url);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String ss = "/3rdOauth/wxa7f436db560a17a3/callback][IP=114.55.18.170]";
    }
}

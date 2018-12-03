package lixb.com.str;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * @author lixb
 * 2018/6/21 下午8:06
 */
public class StringTest {
    public static void main(String[] args) {
        String str4 = "12"+"3";
        String str5 = "123";
        String str1 = new String("123");
        String str2 = new String("123");
        str1.intern();
//        str2.intern();
        String str3 = (str2+"");
        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
        System.out.println(str1==str4);
        System.out.println(str1==str3);
        System.out.println(str4==str3);
        System.out.println("*************");
        str3 = str3.intern();
        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str4==str3);
        System.out.println(str4==str5);

    }
}

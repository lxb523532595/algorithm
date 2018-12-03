package lixb.com.str;

/**
 * @author lixb
 * 2018/7/25 上午9:19
 */
public class TimeOfString {
    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            String str1 = "sdf;"+i;
        }
        long l2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<10000;i++){
            sb.append("sdf;"+i);
        }
        long l3 = System.currentTimeMillis();
        System.out.println(l2-l1);
        System.out.println(l3-l2);
    }
}

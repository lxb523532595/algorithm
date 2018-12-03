package lixb.com.virtual;

/**
 * @author lixb
 * 2018/7/10 下午7:34
 */
public class TestPretenureSizeTheshold  {
    private static final int _1MB = 1024 * 1024;
    /**
     * 测试大对象直接分配进入老年代
     */
    public static void testPretenureSizeTheshold(){
        byte[] allocation = new byte[4*_1MB];
    }


    public static void main(String[] args) {
        testPretenureSizeTheshold();
    }
}

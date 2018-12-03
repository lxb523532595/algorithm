package lixb.com.virtual;

/**
 * @author lixb
 * 2018/7/10 下午1:34
 */
public class Allocation {

    private static final int _1MB = 1024 * 1024;

    /**
     * 内存自动分配
     */
    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2*_1MB];
        System.out.println("allocation1 "+allocation1.hashCode());
        allocation2 = new byte[2*_1MB];
        System.out.println("allocation2 "+allocation2.toString());
        allocation3 = new byte[2*_1MB];
        System.out.println("allocation3 "+allocation3.toString());
        allocation4 = new byte[5*_1MB];
        System.out.println("allocation4 "+allocation4.toString());
    }

    /**
     * 测试大对象直接分配进入老年代
     */
    public static void testPretenureSizeTheshold(){
        byte[] allocation = new byte[4*_1MB];
    }


    public static void main(String[] args) {
//        testAllocation();
    }
}

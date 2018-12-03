package lixb.com.main;

import java.lang.reflect.InvocationTargetException;

/**
 * @author lixb
 * 2018/6/20 下午5:40
 */
public class Test {
    public String getWan(){
        return "wan";
    }
    public Test(String wan){}
    public static void main(String[] args) {
        Class cla = Test.class;
        String className = cla.getName();
        System.out.println(className);

        try {
//            Class
            System.out.println(cla.getDeclaredConstructors().length);
           Test test =  (Test)cla.getDeclaredConstructors()[0].newInstance("");
            System.out.println(test.getWan());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}

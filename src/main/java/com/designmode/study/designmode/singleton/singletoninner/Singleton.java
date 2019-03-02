package java.com.designmode.study.designmode.singleton.singletoninner;

/**
 * @ClassName Singleton
 * @Description:TODO
 * @Author TANGHJ
 * @Date 2019/3/2 16:21
 * @Version 1.0
 **/
public class Singleton {
    private  Singleton(){}
    private static class InnerClass {
        private static final Singleton SINGLETON= new Singleton();
    }
    public static Singleton getInstance(){
        return  InnerClass.SINGLETON;
    }
}

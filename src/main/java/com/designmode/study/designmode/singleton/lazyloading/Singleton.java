package java.com.designmode.study.designmode.singleton.lazyloading;

public class Singleton {
    private  Singleton(){}
    private  static  Singleton singleton;
    public static  Singleton getInstance(){
        if (null == singleton){
            singleton =  new  Singleton();
        }
        return  singleton;
    }
}

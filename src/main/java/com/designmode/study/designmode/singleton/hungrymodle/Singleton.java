package java.com.designmode.study.designmode.singleton.hungrymodle;

/**
 *单例模式  饿汉模式
 */
public class Singleton {

    private  Singleton(){};
    private  static  final  Singleton  SINGLETON=new Singleton();

    public  static Singleton getInstance(){
        return  SINGLETON;
    }


}

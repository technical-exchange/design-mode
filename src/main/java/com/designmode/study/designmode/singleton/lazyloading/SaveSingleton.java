package java.com.designmode.study.designmode.singleton.lazyloading;

/**
 * 单例模式
 * 懒汉式 线程安全
 */
public class SaveSingleton {
    private  SaveSingleton(){}
    private  static  SaveSingleton singleton;

    public synchronized  static  SaveSingleton getInstance(){
        if ( null == singleton){
            singleton = new SaveSingleton();
        }
        return  singleton;
    }
}

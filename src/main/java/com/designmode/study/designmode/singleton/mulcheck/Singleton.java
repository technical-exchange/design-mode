package java.com.designmode.study.designmode.singleton.mulcheck;/**
*@ClassName Singleton
*@Description:TODO
*@Author TANGHJ
*@Date 2019/3/2 16:20
*@Version 1.0
*
**/
public class Singleton {
    private  Singleton(){}
    private static  Singleton singleton;

    public static  Singleton getInstance(){
        if (null == singleton){
            synchronized (Singleton.class){
                if ( null == singleton){
                    singleton = new Singleton();
                }
            }
        }
        return  singleton;
    }
}

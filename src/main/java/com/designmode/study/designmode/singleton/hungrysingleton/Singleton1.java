package com.designmode.study.designmode.singleton.hungrysingleton;

/**
 * @ClassName Singleton1
 * @Description:单例模式 饿汉模式 线程安全 若不使用，一直从应用的启动 到销毁 都存在 占用内存
 * @Author TANGHJ
 * @Date 2019/3/2 22:42
 * @Version 1.0
 **/
public class Singleton1 {
    private  Singleton1(){}
    private  static  Singleton1 singleton1;
    static {
        singleton1 = new Singleton1();
    }
    public static  Singleton1 getInstance(){
       return  singleton1;
    }

}

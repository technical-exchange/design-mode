package com.designmode.study.designmode.singleton.hungrysingleton;

/**
 *@ClassName Singleton
 *@Description:饿汉模式
 *@Author TANGHJ
 *@Date 2019/3/2 16:20
 *@Version 1.0
 *
 **/
public class Singleton {

    private  Singleton(){};
    private  static  final  Singleton  SINGLETON=new Singleton();

    public  static Singleton getInstance(){
        return  SINGLETON;
    }


}

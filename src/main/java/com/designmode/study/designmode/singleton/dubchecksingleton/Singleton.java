package com.designmode.study.designmode.singleton.dubchecksingleton;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
*@ClassName Singleton
*@Description:双重校验模式
*@Author TANGHJ
*@Date 2019/3/2 16:20
*@Version 1.0
*
**/
public class Singleton {
    private volatile static  Log log = LogFactory.getLog(Singleton.class);
    private  static  int  number = 0;
    private  Singleton(){
        number ++;
        log.debug(Thread.currentThread()+"num**********"+number);
    }
    public   final  Object obj= new Object();
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
    public  static void  main(String [] args) throws  Exception{
        Integer loopNum = 10;
        Set<Object> instanceSet = new HashSet<>();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        CountDownLatch countDownLatch = new CountDownLatch(loopNum);
        for (int i = 0; i < loopNum; i++) {
            //启动线程
            executor.execute(() -> {
                Singleton obj =Singleton.getInstance();
                instanceSet.add(obj);
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executor.shutdown();
    }
}

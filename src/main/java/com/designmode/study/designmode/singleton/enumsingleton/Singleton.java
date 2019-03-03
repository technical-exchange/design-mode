package com.designmode.study.designmode.singleton.enumsingleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *@ClassName Singleton
 *@Description:枚举单例模式
 *@Author TANGHJ
 *@Date 2019/3/2 16:20
 *@Version 1.0
 *
 **/
public enum Singleton {
    /**
     * 枚举类型
     */
    INSTENCE;
    public  void  printHello(){
        System.out.println(Thread.currentThread()+"***************" );

    }

    public  static  void main(String [] args) throws  Exception{
        Integer loopNum = 10;
        ExecutorService executor = Executors.newFixedThreadPool(5);
        CountDownLatch countDownLatch = new CountDownLatch(loopNum);
        for (int i = 0; i < loopNum; i++) {
            executor.execute(() -> {
                Singleton instance = Singleton.INSTENCE;
                instance.printHello();
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executor.shutdown();
    }
}

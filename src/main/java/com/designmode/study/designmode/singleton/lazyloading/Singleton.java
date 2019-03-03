package com.designmode.study.designmode.singleton.lazyloading;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Singleton {
    private  volatile  static Log log = LogFactory.getLog(Singleton.class);
    private  static  int a = 0;
    private  Singleton(){
    }
    private  static  Singleton singleton;
    public static  Singleton getInstance(){
        if (null == singleton){
            singleton =  new  Singleton();
        }
        a++;
        log.debug(Thread.currentThread()+"a********"+a);
        return  singleton;
    }

    public  static  void main (String [] args) throws  Exception{
        {
            Integer loopNum = 10;
            ExecutorService executor = Executors.newFixedThreadPool(5);
            CountDownLatch countDownLatch = new CountDownLatch(loopNum);
            for (int i = 0; i < loopNum; i++) {
                executor.execute(() -> {
                    Singleton.getInstance();
                    countDownLatch.countDown();
                });
            }
            countDownLatch.await();
            executor.shutdown();
        }
    }
}

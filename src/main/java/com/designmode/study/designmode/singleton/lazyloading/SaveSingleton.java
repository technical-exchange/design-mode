package com.designmode.study.designmode.singleton.lazyloading;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 单例模式
 * 懒汉式 线程安全
 */
public class SaveSingleton {
    private volatile static Log log = LogFactory.getLog(SaveSingleton.class);
    private  static  int num = 0;
    private  SaveSingleton(){}
    private  static  SaveSingleton singleton;

    public synchronized  static  SaveSingleton getInstance(){
        if ( null == singleton){
            singleton = new SaveSingleton();
        }
        num ++;
        log.debug(Thread.currentThread()+"num:**********"+num);
        return  singleton;
    }
    public  static  void  main(String [] args) throws Exception{
                Integer loopNum = 10;
                ExecutorService executor = Executors.newFixedThreadPool(5);
                CountDownLatch countDownLatch = new CountDownLatch(loopNum);
                for (int i = 0; i < loopNum; i++) {
                    executor.execute(() -> {
                        SaveSingleton.getInstance();
//                instanceSet.add(obj);
                        countDownLatch.countDown();
                    });
                }
                countDownLatch.await();
                executor.shutdown();
    }
}

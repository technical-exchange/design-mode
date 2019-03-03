package com.designmode.study.designmode.singleton.innersingleton;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName Singleton
 * @Description:静态内部类  在内部类被调用时 才会创建对象
 * @Author TANGHJ
 * @Date 2019/3/2 16:21
 * @Version 1.0
 **/
public class Singleton {
    private  volatile  static Log log = LogFactory.getLog(Singleton.class);
    private  static  int num = 0;
    private  Singleton(){
    num ++ ;
        log.debug(Thread.currentThread() +"******"+num);
    }
    private static class InnerClass {
        /**
         * 创建单例对象
         */
        private static final Singleton SINGLETON= new Singleton();
    }
    public  void  say(){

    }
    public static Singleton getInstance(){
        return  InnerClass.SINGLETON;
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

        System.out.println(instanceSet);

    }






}

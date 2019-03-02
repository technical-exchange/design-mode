package java.com.designmode.study.designmode.singleton.enumsingleton;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *单例模式 枚举类型
 */
public enum Singleton {
    /**
     * 枚举类型
     */
    INSTENCE;
    public  void  printHello(){
        System.out.println("枚举类型 单例模式");

    }

    public  static  void main(String [] args) throws  Exception{
        Integer loopNum = 10000000;
//        Integer loopNum = 1000;
        Set<Object> instanceSet = new HashSet<>();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        CountDownLatch countDownLatch = new CountDownLatch(loopNum);
        for (int i = 0; i < loopNum; i++) {
            executor.execute(() -> {
                Singleton instance = Singleton.INSTENCE;
                instance.printHello();
                instance.printHello();
//                instanceSet.add(obj);
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executor.shutdown();

        System.out.println(instanceSet);
    }
}

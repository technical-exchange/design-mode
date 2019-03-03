package com.designmode.study.designmode.singleton;

/***
 * @ClassName: Test
 * @Description:TODO
 * @author: chenling
 * @Date: 2019/2/25 23:29
 * @version : V1.0.0
 */
public class Test  implements  Runnable{
    private  static  int  a=0;
    public  Test(){
        a++;
        System.out.println("a"+"********************"+a);
    }

    @Override
    public void run() {
        new Test();
    }
}

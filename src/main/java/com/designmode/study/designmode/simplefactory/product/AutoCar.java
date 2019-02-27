package com.designmode.study.designmode.simplefactory.product;

/***
 * @ClassName: AutoCar
 * @Description:TODO
 * @author: chenling
 * @Date: 2019/2/27 21:54
 * @version : V1.0.0
 */
public class AutoCar implements   Car {


    @Override
    public void run() {
        System.out.println("******奥迪汽车********");
    }
}

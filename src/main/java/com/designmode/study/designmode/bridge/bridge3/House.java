package com.designmode.study.designmode.bridge.bridge3;

/**
 * @ClassName: House
 * @Description:
 * @Auther: shi
 * @Date: 2019/3/26 15:50
 */
public class House extends Product {

    @Override
    public void beProducted() {
        System.out.println("房子被建造");
    }

    @Override
    public void beSelled() {

    }
}

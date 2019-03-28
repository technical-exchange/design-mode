package com.designmode.study.designmode.bridge.bridge1;

import com.designmode.study.designmode.bridge.bridge1.Corp;

/**
 * @ClassName: HouseCorp
 * @Description: 定义一个房地产公司继承公司类 实现相关方法
 * @Auther: shi
 * @Date: 2019/3/26 14:52
 */
public  class HouseCorp extends Corp {

    @Override
    protected void produce() {
        System.out.println("房地产公司盖房子...");
    }

    @Override
    protected void sell() {
        System.out.println("房地产公司出售房子...");
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }
}

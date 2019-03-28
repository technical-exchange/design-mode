package com.designmode.study.designmode.bridge.bridge2;

import com.designmode.study.designmode.bridge.bridge1.Corp;

/**
 * @ClassName: IPodCorp
 * @Description: 定义一个生产iPod的公司 继承Corp类
 * 实现相关方法
 * @Auther: shi
 * @Date: 2019/3/26 15:18
 */
public class IPodCorp extends Corp {
    @Override
    protected void produce() {

        System.out.println("我生产iPod...");
    }
    @Override
    protected void sell() {
        System.out.println("iPod畅销...");
    }
    @Override
    public void makeMoney(){
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
}

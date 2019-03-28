package com.designmode.study.designmode.bridge.bridge1;

/**
 * @ClassName: ClothesCorp
 * @Description: 定义一个服装公司继承公司类 实现相关方法
 * @Auther: shi
 * @Date: 2019/3/26 14:55
 */
public class ClothesCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("服装公司生产衣服...");
    }
    @Override
    protected void sell() {
        System.out.println("服装公司出售衣服...");
    }
    @Override
    public void makeMoney(){
        super.makeMoney();
        System.out.println("服装公司赚小钱...");
    }
}

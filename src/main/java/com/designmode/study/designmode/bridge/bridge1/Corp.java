package com.designmode.study.designmode.bridge.bridge1;

/**
 * @ClassName: Corp
 * @Description: 定义一个公司的抽象类
 *包含 生产、销售、赚钱方法
 * @Auther: shi
 * @Date: 2019/3/26 14:47
 */
public abstract class Corp {


    protected abstract void produce();

    protected abstract void sell();

    public void makeMoney() {

        this.produce();

        this.sell();
    }
}

package com.designmode.study.designmode.bridge.bridge3;

/**
 * @ClassName: Corp
 * @Description:
 * @Auther: shi
 * @Date: 2019/3/26 15:53
 */
public abstract class Corp {
    private Product product;

    public Corp(Product product){
        this.product = product;
    }

    public void makeMoney(){

        this.product.beProducted();

        this.product.beSelled();
    }
}

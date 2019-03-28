package com.designmode.study.designmode.bridge.bridge3;

/**
 * @ClassName: ShanZhaiCorp
 * @Description:
 * @Auther: shi
 * @Date: 2019/3/26 16:22
 */
public class ShanZhaiCorp extends Corp {

    public ShanZhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney(){
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
}

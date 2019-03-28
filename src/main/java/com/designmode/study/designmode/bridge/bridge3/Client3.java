package com.designmode.study.designmode.bridge.bridge3;

import com.designmode.study.designmode.bridge.bridge1.HouseCorp;

/**
 * @ClassName: Client3
 * @Description:
 * @Auther: shi
 * @Date: 2019/3/26 16:28
 */
public class Client3  {
    public static void main(String[] args) {

        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
        shanZhaiCorp.makeMoney();
    }
}

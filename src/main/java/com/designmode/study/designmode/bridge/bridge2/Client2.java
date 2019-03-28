package com.designmode.study.designmode.bridge.bridge2;

import com.designmode.study.designmode.bridge.bridge1.HouseCorp;

/**
 * @ClassName: Client2
 * @Description: 定义第二个 client类 查看房地产公司和iPod公司的情况
 * @Auther: shi
 * @Date: 2019/3/26 15:20
 */
public class Client2  {
    public static void main(String[] args) {
        System.out.println("-------房地产公司是这个样子运行的-------");

        HouseCorp houseCorp =new HouseCorp();
        houseCorp.makeMoney();
        System.out.println("\n");
        System.out.println("-------山寨公司是这样运行的-------");
        IPodCorp iPodCorp = new IPodCorp();
        iPodCorp.makeMoney();
    }
}

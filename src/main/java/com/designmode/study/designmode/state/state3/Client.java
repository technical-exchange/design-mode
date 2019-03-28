package com.designmode.study.designmode.state.state3;

/**
 * @ClassName: Client
 * @Description: 定义一个客户类 操作电梯
 * @Auther: shi
 * @Date: 2019/3/27 18:53
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new OpenningState());
        context.close();
        context.open();
        context.run();
        context.stop();
    }
}

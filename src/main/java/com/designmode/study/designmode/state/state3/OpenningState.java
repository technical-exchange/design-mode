package com.designmode.study.designmode.state.state3;

/**
 * @ClassName: OpenningState
 * @Description: 电梯开启状态类
 * @Auther: shi
 * @Date: 2019/3/27 18:46
 */
public class OpenningState extends LiftState {

    //开启当然可以关闭了，我就想测试一下电梯门开关功能
    @Override
    public void close() {
    }
    //打开电梯门
    @Override
    public void open() {
        //状态修改
        System.out.println("电梯门开启...");
        super.context.setLiftState(Context.openningState);
        //动作委托为CloseState来执行
        super.context.getLiftState().close();
    }
    //门开着电梯就想跑，这电梯，吓死你！
    @Override
    public void run() {

//do nothing;
    }
    //开门还不停止
    @Override
    public void stop() {

    }
}

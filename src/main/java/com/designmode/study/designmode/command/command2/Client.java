package com.designmode.study.designmode.command.command2;

/**
 * @ClassName: Client
 * @Description:
 * @Auther: shi
 * @Date: 2019/3/26 17:33
 */
public class Client {
    public static void main(String[] args) {
        //定义我们的接头人
        Invoker xiaoSan = new Invoker(); //接头人就是我小三
        //客户要求增加一项需求
        System.out.println("-------------客户要求增加一项需求-----------------");
        //客户给我们下命令来
        Command command = new AddRequirementCommand();
        //接头人接收到命令
        xiaoSan.setCommand(command);
        //接头人执行命令
        xiaoSan.action();
    }
}

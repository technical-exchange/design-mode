package com.designmode.study.designmode.command.command2;

/**
 * @ClassName: Invoker
 * @Description:
 * @Auther: shi
 * @Date: 2019/3/26 17:31
 */
public class Invoker {

    private Command command;
    //客户发出命令
    public void setCommand(Command command){
        this.command = command;
    }
    //执行客户的命令
    public void action(){
        this.command.execute();
    }
}

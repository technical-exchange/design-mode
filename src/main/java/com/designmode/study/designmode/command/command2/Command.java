package com.designmode.study.designmode.command.command2;

import com.designmode.study.designmode.command.command1.CodeGroup;
import com.designmode.study.designmode.command.command1.PageGroup;
import com.designmode.study.designmode.command.command1.RequirementGroup;

/**
 * @ClassName: Command
 * @Description: 定义一个命令抽象类 用于封装客户端命令
 * @Auther: shi
 * @Date: 2019/3/26 17:21
 */
public abstract class Command {
    //把三个组都定义好，子类可以直接使用
    protected RequirementGroup rg = new RequirementGroup(); //需求组
    protected PageGroup pg = new PageGroup(); //美工组
    protected CodeGroup cg = new CodeGroup(); //代码组;
    //只要一个方法，你要我做什么事情
    public abstract void execute();
}

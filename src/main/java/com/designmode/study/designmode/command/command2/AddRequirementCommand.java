package com.designmode.study.designmode.command.command2;

import com.designmode.study.designmode.command.command1.RequirementGroup;

/**
 * @ClassName: AddRequirementCommand
 * @Description:
 * @Auther: shi
 * @Date: 2019/3/26 17:24
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        //找到需求组
        super.rg.find();
        //增加一份需求
        super.rg.add();
        //给出计划
        super.rg.plan();
    }

}

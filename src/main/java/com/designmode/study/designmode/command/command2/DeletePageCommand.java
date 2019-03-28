package com.designmode.study.designmode.command.command2;

/**
 * @ClassName: DeletePageCommand
 * @Description:
 * @Auther: shi
 * @Date: 2019/3/26 17:29
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pg.find();
        super.pg.delete();
        super.pg.plan();
    }
}

package com.designmode.study.designmode.compositePattern;

/***
 * @ClassName: FinanceDepartment
 * @Description:TODO
 * @author: chenling
 * @Date: 2019/3/17 12:37
 * @version : V1.0.0
 */
public class FinanceDepartment extends  Company {


    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    void add(Company c) {

    }

    @Override
    void remove(Company c) {

    }

    @Override
    void display(int depth) {
        logger.info("---"+name);
    }

    @Override
    void lineOfDuty() {
        logger.info("{} 公司财务收支管理",name);
    }
}

package com.designmode.study.designmode.compositePattern;

/***
 * @ClassName: HRDepartment
 * @Description:TODO
 * @author: chenling
 * @Date: 2019/3/17 12:22
 * @version : V1.0.0
 */
public class HRDepartment extends  Company {

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
        logger.info("{}员工招聘培训管理 ",name);
    }

    public HRDepartment(String name) {
        super(name);
    }
}

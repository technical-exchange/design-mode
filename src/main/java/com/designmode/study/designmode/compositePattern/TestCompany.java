package com.designmode.study.designmode.compositePattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/***
 * @ClassName: TestCompany
 * @Description:TODO
 * @author: chenling
 * @Date: 2019/3/17 12:51
 * @version : V1.0.0
 */
public class TestCompany {

    private static Logger logger = LoggerFactory.getLogger(TestCompany.class);

    public static void main(String[] args) {



        AbstractCompany root = new AbstractCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));


        AbstractCompany comp = new AbstractCompany("上海华东分公司");
        comp.add(new HRDepartment("华东分公司人力资源部"));
        comp.add(new FinanceDepartment("华东分公司财务部"));
        root.add(comp);


        AbstractCompany comp1 = new AbstractCompany("南京办事处");
        comp1.add(new HRDepartment("南京办事处人力资源部"));
        comp1.add(new FinanceDepartment("南京办事处财务部"));
        root.add(comp1);


        AbstractCompany comp2 = new AbstractCompany("杭州办事处");
        comp2.add(new HRDepartment("杭州办事处人力资源部"));
        comp2.add(new FinanceDepartment("杭州办事处财务部"));
        root.add(comp2);
        logger.info("结构图");
        root.display(1);
        logger.info("职责");
        root.lineOfDuty();



    }




}

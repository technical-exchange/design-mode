package com.designmode.study.designmode.compositePattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/***
 * @ClassName: Company
 * @Description:TODO
 * @author: chenling
 * @Date: 2019/3/17 12:05
 * @version : V1.0.0
 */
public abstract   class Company {

    public Logger logger = LoggerFactory.getLogger(AbstractCompany.class);

    protected  String name;

    public Company(String name){
         this.name=name;
    }

    abstract void add(Company c);

    abstract void remove(Company c);

    abstract void display(int depth);

    abstract void lineOfDuty();



}

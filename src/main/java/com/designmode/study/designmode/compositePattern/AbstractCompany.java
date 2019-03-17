package com.designmode.study.designmode.compositePattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/***
 * @ClassName: abstractCompany
 * @Description:TODO
 * @author: chenling
 * @Date: 2019/3/17 12:09
 * @version : V1.0.0
 */
public class AbstractCompany  extends Company {

    private Logger logger = LoggerFactory.getLogger(AbstractCompany.class);

    private List<Company> childer = new ArrayList<Company>();


    @Override
    void add(Company c) {
        childer.add(c);
    }

    @Override
    void remove(Company c) {
        childer.remove(c);
    }

    @Override
    void display(int depth) {
        childer.forEach(c->{
            c.display(depth+2);
        });
    }

    @Override
    void lineOfDuty() {
        childer.forEach(c->{
            c.lineOfDuty();
        });

    }


    public AbstractCompany(String name) {
        super(name);
    }
}

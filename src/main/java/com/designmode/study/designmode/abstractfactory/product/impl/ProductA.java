package com.designmode.study.designmode.abstractfactory.product.impl;

import com.designmode.study.designmode.abstractfactory.product.service.AbstractProductA;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @ClassName ProductA
 * @Description:TODO
 * @Author TANGHJ
 * @Date 2019/3/9 21:45
 * @Version 1.0
 **/
public class ProductA implements AbstractProductA {
    private static  volatile Log log = LogFactory.getLog(ProductA.class);
    public  ProductA(){
        log.debug("英特尔CPU");

    }
    @Override
    public void cupModle() {
        log.debug("英特尔CPU");
    }
}

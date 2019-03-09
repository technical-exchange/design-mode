package com.designmode.study.designmode.abstractfactory.product.impl;

import com.designmode.study.designmode.abstractfactory.product.service.AbstractProductB;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @ClassName ProductB1
 * @Description:TODO
 * @Author TANGHJ
 * @Date 2019/3/9 22:18
 * @Version 1.0
 **/
public class ProductB1 implements AbstractProductB {
    private static  volatile Log log = LogFactory.getLog(ProductB1.class);
    public  ProductB1(){
        log.debug("AMD主板");

    }
    @Override
    public void mainBorad() {
    log.debug("AMD主板");

    }
}

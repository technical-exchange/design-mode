package com.designmode.study.designmode.abstractfactory.product.impl;

import com.designmode.study.designmode.abstractfactory.product.service.AbstractProductB;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @ClassName ProductB
 * @Description:TODO
 * @Author TANGHJ
 * @Date 2019/3/9 22:16
 * @Version 1.0
 **/
public class ProductB implements AbstractProductB {
    private  static volatile Log log = LogFactory.getLog(ProductB.class);
    public ProductB(){
        log.debug("英特尔主板");

    }
    @Override
    public void mainBorad() {
        log.debug("英特尔主板");
    }
}

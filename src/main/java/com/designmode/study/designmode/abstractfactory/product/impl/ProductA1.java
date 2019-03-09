package com.designmode.study.designmode.abstractfactory.product.impl;

import com.designmode.study.designmode.abstractfactory.product.service.AbstractProductA;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @ClassName ProductA1
 * @Description:TODO
 * @Author TANGHJ
 * @Date 2019/3/9 22:17
 * @Version 1.0
 **/
public class ProductA1  implements AbstractProductA{
 private  static  volatile Log log = LogFactory.getLog(ProductA1.class);
 public  ProductA1(){
     log.debug("ADMCPU");

 }
    @Override
    public void cupModle() {
    log.debug("ADMCPU");
    }
}

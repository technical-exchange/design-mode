package com.designmode.study.designmode.abstractfactory;

import com.designmode.study.designmode.abstractfactory.productsimplefactory.ProductFactoryA;

/**
 * @ClassName Computer
 * @Description:TODO
 * @Author TANGHJ
 * @Date 2019/3/9 23:49
 * @Version 1.0
 **/
public class Computer {
    AbstractFactory productFactoryA;
    public  Computer(){

    }
    public  void create(){
        productFactoryA =new ProductFactoryA();
        productFactoryA.createProductA();
        productFactoryA.createProductB();
    }

}

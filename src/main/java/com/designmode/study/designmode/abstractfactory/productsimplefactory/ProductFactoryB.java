package com.designmode.study.designmode.abstractfactory.productsimplefactory;

import com.designmode.study.designmode.abstractfactory.AbstractFactory;
import com.designmode.study.designmode.abstractfactory.product.impl.ProductA1;
import com.designmode.study.designmode.abstractfactory.product.impl.ProductB1;
import com.designmode.study.designmode.abstractfactory.product.service.AbstractProductA;
import com.designmode.study.designmode.abstractfactory.product.service.AbstractProductB;

public class ProductFactoryB  implements AbstractFactory{


    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }
}

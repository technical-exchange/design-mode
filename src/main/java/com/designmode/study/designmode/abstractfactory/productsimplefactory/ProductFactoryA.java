package com.designmode.study.designmode.abstractfactory.productsimplefactory;

import com.designmode.study.designmode.abstractfactory.AbstractFactory;
import com.designmode.study.designmode.abstractfactory.product.impl.ProductA;
import com.designmode.study.designmode.abstractfactory.product.impl.ProductB;
import com.designmode.study.designmode.abstractfactory.product.service.AbstractProductA;
import com.designmode.study.designmode.abstractfactory.product.service.AbstractProductB;

public class ProductFactoryA  implements AbstractFactory{


    @Override
    public AbstractProductB createProductB() {
        return new ProductB();
    }

    @Override
    public AbstractProductA createProductA() {
        return new ProductA();
    }
}

package com.designmode.study.designmode.abstractfactory;

import com.designmode.study.designmode.abstractfactory.product.service.AbstractProductA;
import com.designmode.study.designmode.abstractfactory.product.service.AbstractProductB;

public interface AbstractFactory {
    AbstractProductB createProductB();
    AbstractProductA createProductA();

}

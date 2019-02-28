package com.designmode.study.designmode.feactorymethod;

import com.designmode.study.designmode.feactorymethod.Ifactorymechod.FactoryInterface;
import com.designmode.study.designmode.feactorymethod.Ifactorymechod.FoodInterface;
import com.designmode.study.designmode.feactorymethod.factorymechodImpl.SaltyFactoryImpl;
import com.designmode.study.designmode.feactorymethod.factorymechodImpl.SweetFactoryImpl;

/***
 * @ClassName: Test
 * @Description:TODO
 * @author: chenling
 * @Date: 2019/2/25 23:29
 * @version : V1.0.0
 */
public class Test {

    public static void main(String[] args) {
        //System.out.println("test");
    	//客户想吃甜的
    	FactoryInterface factory1 = new SweetFactoryImpl();
    	FoodInterface createFood1 = factory1.createFood();
    	createFood1.showFood();
    	System.out.println("-------------------------");
    	//客户想吃咸的
    	FactoryInterface factory2 = new SaltyFactoryImpl();
    	FoodInterface createFood2 = factory2.createFood();
    	createFood2.showFood();
    }
}

package com.designmode.study.designmode.feactorymethod.factorymechodImpl;

import com.designmode.study.designmode.feactorymethod.Ifactorymechod.FactoryInterface;
import com.designmode.study.designmode.feactorymethod.Ifactorymechod.FoodInterface;
/**
 * 
 * @author cys
 *甜食工厂生产甜食
 */
public class SweetFactoryImpl implements FactoryInterface{

	@Override
	public FoodInterface createFood() {
		// TODO Auto-generated method stub
		return new SweetFoodsImpl();
	}

}

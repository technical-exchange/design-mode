package com.designmode.study.designmode.feactorymethod.factorymechodImpl;

import com.designmode.study.designmode.feactorymethod.Ifactorymechod.FactoryInterface;
import com.designmode.study.designmode.feactorymethod.Ifactorymechod.FoodInterface;

public class SaltyFactoryImpl implements FactoryInterface{

	@Override
	public FoodInterface createFood() {
		// TODO Auto-generated method stub
		return new SaltyFoodsImpl();
	}

}

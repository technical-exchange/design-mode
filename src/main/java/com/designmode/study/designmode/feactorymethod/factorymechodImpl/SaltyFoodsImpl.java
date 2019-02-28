package com.designmode.study.designmode.feactorymethod.factorymechodImpl;

import com.designmode.study.designmode.feactorymethod.Ifactorymechod.FoodInterface;
/**
 * 
 * @author cys
 *食物的实现类 咸食
 */
public class SaltyFoodsImpl implements FoodInterface{

	@Override
	public void showFood() {
		// TODO Auto-generated method stub
		System.out.println("我是咸的食物");
	}

}

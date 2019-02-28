package com.designmode.study.designmode.feactorymethod.factorymechodImpl;

import com.designmode.study.designmode.feactorymethod.Ifactorymechod.FoodInterface;
/**
 * 食物的实现类：甜食
 * @author cys
 *
 */
public class SweetFoodsImpl implements FoodInterface {

	@Override
	public void showFood() {
		// TODO Auto-generated method stub
		System.out.println("我是甜的食物");
	}

}

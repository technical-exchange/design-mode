package com.designmode.study.designmode.decoratorpattern.concretecomponent;

import com.designmode.study.designmode.decoratorpattern.component.Person;

public class Man implements Person{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("男人吃东西");
	}
}

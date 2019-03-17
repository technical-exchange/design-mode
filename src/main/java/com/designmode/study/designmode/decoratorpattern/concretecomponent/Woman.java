package com.designmode.study.designmode.decoratorpattern.concretecomponent;

import com.designmode.study.designmode.decoratorpattern.component.Person;

public class Woman implements Person{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("女人在吃东西");
	}

}

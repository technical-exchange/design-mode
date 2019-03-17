package com.designmode.study.designmode.decoratorpattern.concretedecorator;

import com.designmode.study.designmode.decoratorpattern.decorator.Decorator;

public class ManDecorator extends Decorator{
	public void eat(){
		super.eat();
		System.out.println("我想再吃点");
		eatMore();
	}
	public void eatMore(){
		System.out.println("好，再吃点");
	}
}	

package com.designmode.study.designmode.decoratorpattern.concretedecorator;

import com.designmode.study.designmode.decoratorpattern.decorator.Decorator;

public class WomanDecorator extends Decorator{
	public void eat(){
		super.eat();
		System.out.println("我想少吃点");
		eatLess();
	}

	private void eatLess() {
		// TODO Auto-generated method stub
		System.out.println("少吃点吧");
	}
}

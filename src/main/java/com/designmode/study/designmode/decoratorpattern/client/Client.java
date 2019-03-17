package com.designmode.study.designmode.decoratorpattern.client;

import com.designmode.study.designmode.decoratorpattern.component.Person;
import com.designmode.study.designmode.decoratorpattern.concretecomponent.Man;
import com.designmode.study.designmode.decoratorpattern.concretecomponent.Woman;
import com.designmode.study.designmode.decoratorpattern.concretedecorator.ManDecorator;
import com.designmode.study.designmode.decoratorpattern.concretedecorator.WomanDecorator;
import com.designmode.study.designmode.decoratorpattern.decorator.Decorator;

public class Client {
	public static void main(String[] args) {
		Person manPerson = new Man();
		//男人具体装饰类
		Decorator manDecorator = new ManDecorator();
		manDecorator.setPerson(manPerson);
		manDecorator.eat();
		System.out.println("********");
		Person womanPerson = new Woman();
		//男人具体装饰类
		Decorator womanDecorator = new WomanDecorator();
		//womanDecorator.setPerson(womanPerson);
		//womanDecorator.setPerson(manPerson);
		//womanDecorator.setPerson(manDecorator);
		womanDecorator.setPerson(womanPerson);
		womanDecorator.eat();
	}
	
	
	
	
}

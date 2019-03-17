package com.designmode.study.designmode.decoratorpattern.decorator;

import com.designmode.study.designmode.decoratorpattern.component.Person;

public abstract class Decorator implements Person{
	Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	
	public void eat() {
		person.eat();
	}
	
}

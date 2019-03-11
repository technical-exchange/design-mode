package com.designmode.study.designmode.prototypepattern.shallowclone;
/**
 * 
 * @author cys
 *附件类
 */
public class Attachment {
	@Override
	public String toString() {
		return "Attachment [name=" + name + "]";
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

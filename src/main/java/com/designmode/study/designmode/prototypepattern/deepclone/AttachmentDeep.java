package com.designmode.study.designmode.prototypepattern.deepclone;

import java.io.Serializable;

public class AttachmentDeep implements Serializable{

	/**
	 * 版本号
	 */
	private static final long serialVersionUID = 1L;
	
	String name;

	@Override
	public String toString() {
		return "Attachment [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

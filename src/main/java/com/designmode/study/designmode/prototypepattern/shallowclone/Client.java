package com.designmode.study.designmode.prototypepattern.shallowclone;
/**
 * 
 * @author cys
 *客户类
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		WeeklyLog preLog = new WeeklyLog();
		Attachment attachment = new Attachment();
		attachment.setName("我是附件");
		preLog.setAttachment(attachment);
		preLog.setName("我是周报名字");
		preLog.setContent("我是内容");
		WeeklyLog aftercloneLog = preLog.clone();
		System.out.println(preLog);
		System.out.println(aftercloneLog);
		System.out.println(preLog==aftercloneLog);
		
		System.out.println(preLog.getName()==aftercloneLog.getName());
		System.out.println(preLog.getAttachment()==aftercloneLog.getAttachment());
	}
}

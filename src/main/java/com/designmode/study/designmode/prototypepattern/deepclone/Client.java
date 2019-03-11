package com.designmode.study.designmode.prototypepattern.deepclone;
import java.io.IOException;
import java.io.OptionalDataException;

public class Client {
	public static void main(String[] args) throws OptionalDataException, ClassNotFoundException, IOException {
		WeeklyLog preLog = new WeeklyLog();
		AttachmentDeep attachment = new AttachmentDeep();
		attachment.setName("我是附");
		preLog.setAttachment(attachment);
		preLog.setName("我是周报名字");
		preLog.setContent("我是内容");
		WeeklyLog aftercloneLog = preLog.deepClone();
		System.out.println(preLog);
		System.out.println(aftercloneLog);
		System.out.println(preLog==aftercloneLog);
		System.out.println(preLog.getName().hashCode());
		System.out.println(aftercloneLog.getName().hashCode());
		System.out.println(preLog.getName()==aftercloneLog.getName());
		System.out.println(preLog.getName().equals(aftercloneLog.getName()));
		System.out.println(preLog.getAttachment()==aftercloneLog.getAttachment());
	}
}

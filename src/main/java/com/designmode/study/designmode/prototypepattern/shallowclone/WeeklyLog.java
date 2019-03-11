package com.designmode.study.designmode.prototypepattern.shallowclone;
/**
 * 
 * @author cys
 *周报类
 */
public class WeeklyLog implements Cloneable{
	private String name;
	private String content;
	private Attachment attachment;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Attachment getAttachment() {
		return attachment;
	}
	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}
	@Override
	public WeeklyLog clone() throws CloneNotSupportedException{
		return (WeeklyLog) super.clone();
	}
	@Override
	public String toString() {
		return "WeeklyLog [name=" + name + ", content=" + content + ", attachment=" + attachment + "]";
	}
	
}

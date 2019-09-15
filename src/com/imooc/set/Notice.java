package com.imooc.set;

import java.util.Date;

public class Notice {
	private int id;//ID
	private String title;//标题
	private String creator;//创建人
	private Date creatTime;//创建时间
	
	public Notice(int id, String title, String creator, Date creatTime) {
		super();
		this.id = id;
		this.title = title;
		this.creator = creator;
		this.creatTime = creatTime;
	}
	//getter/setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
}

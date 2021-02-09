package com.protein.h2;


public class Member {
	
	private int id;
	private int pw;
	private String name;
	
	public Member() {
		//default 생성자. 
		this.id= 1234;
		this.pw= 5678;
		this.name= "hey";
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//get,set

}

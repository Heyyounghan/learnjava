package com.protein.h1;

public class Member {

	private int id;
	private int pw;
	private String name;
	int age;
	
	
	//Data를 입력 하는 것은 set변수명
	public void setId(int id) {
		this.id= id;
		
	}
	
	//Data를 출력 하는 것은 get변수명
	
	public int getId() {
		return this.id;
		
	}
	
	public Member() {
		//생성자
		
	}
	

	public void info() {
		System.out.println(this.id);
		System.out.println(this.pw);
		System.out.println(this.name);
	}
}

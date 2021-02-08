package com.protein.school;

import com.protein.h1.Member;

public class Student {


	private String name;
	private int num;

	
	public Student(int num,String name) {

		this.name= name;
		this.num= num;
		System.out.printf(this.name+this.num);
		
		
	}
	
	public String getName() {
		return this.name;
	}
	public int getNum() {
		return this.num;
	}


}


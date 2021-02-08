package com.protein.h1;

import com.protein.school.Student;

public class Main {

	public static void main(String[] args) {
		/*
		 * Member member= new Member(); member.id= 1234; member.pw= 5678;
		 * 
		 * 
		 * member.info();
		 */

		Student stu= new Student(1,"iu");
		
		String name= "it";
		int num=1;
		
		System.out.println(stu.getName());
		System.out.println(stu.getNum());
		
		Member mm = new Member();
		mm.age= 20;
		System.out.println(mm.age);
		
		
		

	}

}

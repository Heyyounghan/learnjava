package com.coconut.hey7;

import java.util.Scanner;

public  class MethodTest {
	
	public String ReturnT() {
		Scanner sc= new Scanner(System.in);
		//이름 입력받기. 
		String name= sc.next();
		String name2= sc.toString();
		
		System.out.println(toString()+name);

		return name;
		
	}
	


}

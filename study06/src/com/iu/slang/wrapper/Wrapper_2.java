package com.iu.slang.wrapper;

public class Wrapper_2 {

	public static void main(String[] args) {
		
		int num=10;
		
		Integer n1= new Integer(num);
		num=n1.intValue();
		
		num=n1; // auto unboxing 레퍼런스 => 프리미티브 
		n1= num; // auto boxing  프리미티브 => 레퍼런스 
		//Wrapper 
		
		double d= 3.14;
		n1= (int)d;
		
		System.out.println(n1);
		

	}

}

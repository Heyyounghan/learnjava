package com.coconut.hey3;

public class Operator_01 {
	
	public static void main(String [] args) {
		System.out.println("=======프로그램 실행========");
		 // 형변환 Cascading
		
		int num1= 10 ;
		long num2= 20L;
		
		//num2 = (long)num1;
		// int > long 자동 , long > int 강제
		//int4= (int)(num1+num2)
		num1=(int)num2; // 강제 형변환
		num1= 10;
		num2= 20L;
		
		long num3 = num1+num2;
		System.out.println(num3);
		int num4= num1+(int)num2;
		
		System.out.println(num4);
		System.out.println(num2);
		System.out.println("=======프로그램 종료========");
	}

}

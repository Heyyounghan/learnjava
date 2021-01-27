package com.coconut.hey3;

import java.util.Scanner;

public class Operator_07 {

	public static void main(String[] args) {
		
		int num1=20;
		int num2=10;
		int num3= num1+num2;
		boolean check= num1>num2;
		
		check= num1 != num2;
		
		check= num1 < num2;
		
		boolean check1= true;
		boolean result = check &&check1;
		
		result= check1 == check;
		
		System.out.println(check);
		System.out.println(result);
		
		//  ==  >> primitive 타입 연산자만 가능
		
		int n1= 10;
		int n2= 10;
		
		double d1= 10.0;
		
		result= n1==d1;
		
		char ch= '1';
		n2= 49;
		
		result = ch==n2;
		/*
		 *ch가 int로 자동 형변환되는 것> 1이 아스키코드로 
		 *49가 되기때문에 49와 1은 같지 않음. */
		
		String str= "49";
		// result = n2 == str ; ERROR /  false 참조타입과 primitive타입과 비교를 할 수 없다. 
		String str2= "49";
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		str2 = sc.next(); // 문자열 입력하는거 
		
		result = str == str2; //레퍼런스 타입은 실제 내부에 있는 데이터가 아니라 다른 걸 비교함 나중에 설명 예정
		System.out.println(result);

	}

}

package com.coconut.hey3;

public class Operator_02 {
	public static void main(String [] args) {
		//  int 4
		// long 8byte
		
		//float 4
		// double 8
		
		long num1 = 20;
		float num2= 3.2f; // 변수 값 선언 
		
		num1= (long) num2; 
		// num2= num1; 자동 형변환 낮은것에서 큰  곳으로자동 ,
		num2= num1; 
		// 큰것에서 낮은것으로 자동 이동은 불가능하다. 
		
		int point = 290;		
		
		//double avr= point/3; 
		double avr= point/3.0;
		//int에서 double은 되지만 double에서 int 는 안됀다
		/*
		 *point를 double로 바꾸거나 3을 double로 바꾸거나 아니면
		 *나누는 숫자를 3.0으로 바꾸거나 하면 자동으로 형변환을 할 수 있다. **/
		System.out.println(avr);
		
		
		avr = 10.1;
		
		System.out.println(avr*3);
		// 정확한 소수점이 아닌 근사치를 제공하기 때문에 정확한 값을 위해서는 다른걸 사용해야함.
		// 기본 개념은 이렇게 사용합시다. 
		//* 컴퓨터는 소수점 표현을 정확하게 할 수 없음. 따라서 근사치를 제공한다
		
		avr= 1.33333;
		int n = (int)avr;
		System.out.println(n);


}
	
}
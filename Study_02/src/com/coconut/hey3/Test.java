package com.coconut.hey3;

public class Test{  
	public static void main(String args[]){ 
		int num1= 472;
		int num2= 385;
	
		int five= num2/100; //3
		int four= num2%100/10; //8
		int three= num2%10/1; //5
		int result = (num1*five*100)+(num1*four*10)+(num1*three); 

				
		System.out.println(num1*three);
		System.out.println(num1*four);
		System.out.println(num1*five);
		System.out.println("총계:"+result );
	}
}
// 백준 알고리즘 11번 
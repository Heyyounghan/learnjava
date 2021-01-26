package com.coconut.hey3;

public class Operator_04 {

	public static void main(String[] args) {
		//예제... 시간 1시간. 생각하는 머리를 깨워야함
		// 시도를 해보세요.
		//암호화 프로그램을 s만들어요.
		//0 ->      0
		//1 ->      1
		//2  ->     2
		//3  ->     3 
		//4  ->     10 
		//5  ->     11 
		//6  ->     12 
		//7  ->     13 
		//8  ->     20 
		//9  ->     21 
		//10 ->     22 
		// +, - , /, *, %
		int input= 0;
		int output=0;
		
		input=5;
		output=(input/4)*10+input%4;
		//output=input+(input/4)+5;
		
		System.out.println("입력값 : " + input);
		System.out.println("출력값 : " + output);
		
	}

}

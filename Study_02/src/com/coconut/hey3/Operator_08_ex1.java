package com.coconut.hey3;

import java.util.Scanner;

public class Operator_08_ex1 {

	public static void main(String[] args) {
		//나이를 입력받는다.
		//10대인가 아닌가를 판별하는거 삼항연산자 사용하기 
		//출력 10대이면
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("나이를 입력해 주세요.");
		
		int age = sc.nextInt();
		
		String result= (20>age)&&(age>=10) ? "10대 입니다" : "10대가 아닙니다";
		
		System.out.println(result);
	}

}

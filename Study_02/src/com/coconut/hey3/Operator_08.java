package com.coconut.hey3;

import java.util.Scanner;

public class Operator_08 {

	public static void main(String[] args) {
		// 삼항연산자
		// 조건식 ? 조건식A : 조건식 B , 조건식 A는 true일때 실행이고 B는 false일때 실행이다.
		Scanner sc= new Scanner(System.in);
		
		//20살 이상이면 성인, 아니면 미성년
		System.out.println("나이를 입력하세요.");
		int age= sc.nextInt(); //키보드로부터 입력  받은 데이터를 age에 입력 
		String result = age>19? "성인입니다.":"미성년자입니다.";
		
		System.out.println(result);

	}

}

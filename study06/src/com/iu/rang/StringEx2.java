package com.iu.rang;

import java.util.Scanner;

public class StringEx2 {

	private Scanner sc;

	public void ex1() {

		sc=new Scanner(System.in);

		String insert= sc.next();
		//전보 입력받기

		//글자 숫자 세기.
		int result= insert.length();


		System.out.println("총"+result+"자 입니다. 가격은"+(result*100)+"원입니다.");





	}

	// ex1
	//문자열 입력
	// 전보 1글자당 100원 5글자 500원
	// 최종금액 출력


	//ex2
	// 문자열 입력
	//1 글자를 입력
	// 글자의 갯수를 출력하기. 
	public void ex2() {
		sc=new Scanner(System.in);

		System.out.println("문자열을 입력해주세요.");
		//문자열 입력 
		String str1= sc.nextLine();
		System.out.println("찾을 문자를 알려주세요.(오직 spelling 1개만 가능)");

		//찾을 문자열 입력
		String ch=sc.next();
		int result= str1.indexOf(ch);



		//갯수 출력하기
		System.out.println(result);
	}



}

package com.iu.rang;

import java.util.Scanner;

public class Stringex1 {
	
	//메서드명 ex1
	//주민번호 입력 991213-1234567 숫자열 말고 문자열로 받아주기..
	// 남자 여자 판별
	private Scanner sc;

	public void ex1() {
		 sc= new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요.");
		String insert= sc.next();
		char ch=insert.charAt(7);
		
		if (ch == '1'||ch == '3') {
			System.out.println("남자");
		}else {
			System.out.println("여성");
		}
	
		
	
	}
	public void Ex2(){
		System.out.println("문자를 입력하세요.");
		String str= sc.next();
		char j= str.charAt(1);
		// sc.next().charAt(n);
		
		System.out.println(j);
		
	}
	
	//메서드명 ex2
	//스캐너를 이용해서 문자 하나를 입력 char대입으로 출력하기.
	
	
	

}

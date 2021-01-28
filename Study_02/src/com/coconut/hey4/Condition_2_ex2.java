package com.coconut.hey4;

import java.util.Scanner;

public class Condition_2_ex2 {

	public static void main(String[] args) {
		/*
		 * 아이디와 비밀번호, 회원가입 방식
		 * */
		
		int id= 1234;
		int pw= 6789;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요");
		int idName= sc.nextInt();
		System.out.println("비밀번호");
		int pwName= sc.nextInt();
		
		if (id==idName && pw==pwName) {
			System.out.println("로그인 성공입니다.");
		}else { 
			System.out.println("아이디 혹은 비밀번호가 틀렸습니다.");
		}
		
		
	}

}

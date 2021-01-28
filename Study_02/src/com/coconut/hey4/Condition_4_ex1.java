package com.coconut.hey4;

import java.util.Scanner;

public class Condition_4_ex1 {

	public static void main(String[] args) {
		/*
		 * 1. 회원가입
		 * 2. 로그인
		 * 3. 공지사항
		 * 4. 프로그램종료
		 * */
		Scanner sc= new Scanner(System.in);
		
		System.out.println("번호를 입력해주세요.");
		//번호입력받기 
		int number=sc.nextInt();
		
		
		switch(number) {
		
		case 1:
			System.out.println("회원가입 진행 코드");
			break;
		case 2:
			System.out.println("로그인 진행 코드");
			break;
		case 3:
			System.out.println("공지사항 진행 코드");
			break;
		case 4:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("입력되지않았습니다.");
		}
		
		

	}

}

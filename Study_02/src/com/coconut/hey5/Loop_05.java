package com.coconut.hey5;

import java.util.Scanner;

public class Loop_05 {

	public static void main(String[] args) {
		// 반복문(for, while) 내에서 switch케이스를 쓰는 경우 break 사용에 주의해야한다.

		Scanner sc= new Scanner(System.in);
		boolean check= true;
		
		while(check) {
			// 목록띄우기 
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.종료");
			
			//선택
			int sel= sc.nextInt();
			
			switch(sel) {
			
			case 1:
				System.out.println("회원가입 코드 진행");
				break;
			case 2:
				System.out.println("로그인 코드 진행");
			default:
				System.out.println("프로그램을 종료합니다.");
				check=false;
				break; 
// switch케이스를 벗어나는 break지 반복문while을 벗어날 수 없다. 이 break는 스위치 고유의 break;
			}
			
			

		}
	}

}

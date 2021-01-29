package com.coconut.hey5;

import java.util.Scanner;

public class Loop_04 {

	public static void main(String[] args) {
		// 키오스크 프로그램, 
		
		Scanner sc= new Scanner(System.in);
		
		
		boolean check= true;
		
		while(check) { //메뉴선택하는 곳은 대부분 while을 사용. 
			
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.프로그램 종료");
			
			int select= sc.nextInt();
			
			if(select==1) {
			System.out.println("회원 가입 코드 실행");}
			else if(select==2){
				System.out.println("로그인 코드 실행");
			} //while문의 끝
			else if(select==3) {
				check=false;
				//방식이 다양한
				break;
			}
			
		}
		System.out.println("프로그램 종료 ");

	}
	

}

package com.coconut.hey4;

import java.util.Scanner;

public class Condition_2_ex3 {

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
		
		//login 성공 실패
		boolean check= true;
		
		if (id==idName && pw==pwName) {
			System.out.println("로그인 성공입니다.");
			check=true;
		}else { 
			System.out.println("아이디 혹은 비밀번호가 틀렸습니다.");
			check=false;
		}
		
		//로그인 성공시에만 진행하는 코드
		if(check==true) {	
			System.out.println("월 급여를 입력해주세요.");
			//만원 단위급여 입력하기 		
			int money= sc.nextInt();
			
			System.out.println("고용형태를 선택해주세요.");
			System.out.println("1. 정규직");
			System.out.println("2. 계약직");
			
			int num1= sc.nextInt();
				if(num1 == 1) { //정규직 실급여 계산 //고용보험 2%+의료보험 3%+국민연금 1% 산재보험 1% 를 공제한 금액 출력
					double tax= money*0.07;
					/*
					 * tax= tax+money*0.02;
					 * tax= tax+money*0.03;
					 * tax= tax+money*0.01;
					 * tax= tax+money*0.01; 누적연산.
					 * */
					double total= money-tax; //실수령액 계산
					System.out.println("실수령액은"+total+"만원입니다.");
				}
				if(num1 == 2) {		
					//계약직 실급여.
					//원천징수 3.3% 공제해서 출력하기. 
					double tax=  money*0.033;
					double total= money-tax; // 실수령액 계산
					System.out.println("실수령액은"+total+"만원입니다.");
				}
			

		}
		
		System.out.println("프로그램 종료===========");
		
		
	}

}

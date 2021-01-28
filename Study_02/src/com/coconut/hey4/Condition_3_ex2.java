package com.coconut.hey4;

import java.util.Scanner;

public class Condition_3_ex2 {

	public static void main(String[] args) {
		/*
		 * 점심 메뉴 고르기
		 * 라면 4000 짜장면 6000 햄버거 8000 피자 9900
		 * */
		
		System.out.println("---점심 메뉴 고르기---");
		System.out.println("| 1. 짜장면  6000  |");
		System.out.println("| 2. 라면   4000  |");
		System.out.println("| 3. 햄버거  8000  |");
		System.out.println("| 4. 피자   9900  |");
		System.out.println("-------------------");
		
		Scanner sc= new Scanner(System.in);
		
		//인원수 입력
		System.out.println("인원수를 입력해주세요.");
		int people= sc.nextInt();
		//메뉴 선택하기 
		System.out.println("메뉴를 선택해주세요.");
		int num1= sc.nextInt();
		int total= 0;
		
		if(num1==1) { //짜장면
			total=6000*people;
		}else if(num1==2) { //라면
			total=4000*people;
		}else if(num1==3) { //햄버거 
			total=8000*people;
		}else if(num1==4) { // 피자
			total=9900*people;
		}else {
			System.out.println("메뉴를 다시 선택해주세요.");
		}
		
		//최종 출력 > 총 주문 금액 출력하기.
		System.out.println("총 주문금액은:"+total+"입니다.");

	}

}

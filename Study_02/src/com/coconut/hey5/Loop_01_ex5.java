package com.coconut.hey5;

import java.util.Scanner;

public class Loop_01_ex5 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int id= 1234;
		int pw= 5678;

		//int check= 0;
		boolean check= false;



		for(int i=0; i<5;i++) {

			System.out.println("id 입력");
			int yId= sc.nextInt();
			System.out.println("pw 입력");
			int yPw= sc.nextInt();

			if(id==yId && pw==yPw) {
				System.out.println("로그인 성공");
				//for문은 증감식으로 올라가게 되어있다. 로그인이 성공하더라도 증감식으로 올라가서 조건을 충족함
				//'i<5'조건식이 만족되면 
				//check=1;
				check=true;
				i=5;
			}	else {
				System.out.println("로그인실패");
			}
		} //for문의 끝.

		// for문이 종료되는 조건> 
		//1. 로그인 성공해서 종료되는 경우
		//2. 로그인이 5번 실패해서 종료.

		if(check==true) {
			System.out.println("은행업무 시작");
		} else {
			System.out.println("프로그램 종료");
		}




	}

}

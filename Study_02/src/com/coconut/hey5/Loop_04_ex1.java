package com.coconut.hey5;

import java.util.Scanner;

public class Loop_04_ex1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		//로그인
		int id=1234;
		int pw=5678;
		boolean check= true;
		//횟수가 무제한, 로그인 실패를 하더라도 계속 시도한다. 로그인 성공시 종료한다. ( 1. 로그인 2. 종료)

		while(check) {
			System.out.println("1.로그인");
			System.out.println("2.종료");

			int select= sc.nextInt();

			if(select == 1) { // 로그인
				System.out.println("아이디 입력하기 ");
				// 아이디 입력
				int newId= sc.nextInt();

				System.out.println("비밀번호 입력");
				//비밀번호 입력
				int newPw= sc.nextInt();

				if (id==newId && pw==newPw) {

					System.out.println("로그인이 성공했습니다.");
					check=false;

				}else if( id != newId || pw != newPw)
				{

					System.out.println("로그인이 실패했습니다.");

				}
				
			else if(select == 2){
					System.out.println("종료합니다.");
					break; // 처음으로돌아감
				}


			}
		}	//System.out.println("종료");

	}

}

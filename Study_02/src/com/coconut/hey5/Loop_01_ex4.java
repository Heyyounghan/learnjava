package com.coconut.hey5;

import java.util.Scanner;

public class Loop_01_ex4 {

	public static void main(String[] args) {
		
		int id=1234;
		int pw=5678;
		
		Scanner sc= new Scanner(System.in);
		//로그인시도 최대 5번
		for(int i=0;i<5;i++) {
			System.out.println("아이디 입력");
			id= sc.nextInt();
			System.out.println("비밀번호 입력");
			pw= sc.nextInt();
			
			if(id==1234 && pw== 5678) {
				
				System.out.println("은행업무 시작");
				i=5;
			} else if(i==4){
				System.out.println("은행을 방문해주세요.");
			}else {
				System.out.println("다시 입력해주세요.");
			}
			
		}
		System.out.println("은행업무 시작");


	}

}

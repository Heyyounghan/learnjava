package com.coconut.hey2;

import java.util.Scanner;

public class Var_3 {

	public static void main(String[] args) {
		//특수한 메서드이다. application 실행 시작점.
		System.out.println("=====시작======");
		// 키보드랑 연결할 준비
		Scanner sc= new Scanner(System.in);
		//사용해도된다. 
		System.out.println("Test 실행");
		/**
		 * 나이는 30 살이고 키는 180.2 이고 몸무게는 70.3f이고
		 * 성별은 남이고, 자산은 40억이 있어요. 변수에 대입하고 
		 * 출력하세요.*/
		
		int age=0; // int age = 0; 선생님의 코드는 옆에 주석으로 달 것
		double tall = 0.0;
		
		System.out.println("나이를 입력해주세요.");
		//키보드로부터 입력받기.
		age= sc.nextInt();
		
		//double tall; // double ki = 0.0;
		
		System.out.println("키를 입력해주세요");
		tall= sc.nextDouble();
		
		System.out.println("몸무게를 입력해주세요.");
		float weight; // float weight = 0.0f;
		weight= sc.nextFloat();
		
		char sex; // char gender = ' ' ;
		sex= '남';
		//char 타입은 SystemIn을 받을 수 없습니다. 
		
		long money; // long money =  0L; 
		System.out.println("자산을 입력해주세요");
		money= sc.nextLong();
		//money= 4000000000L; // 이런 방식으로 데이터 선언.
		
		String name= "";
		System.out.println("이름을 입력하세요");
		name= sc.next();
		
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("키:"+tall);
		System.out.println("몸무게:"+weight);
		System.out.println("성별:"+sex);
		System.out.println("자산:"+money);
		/**
		 * Sysout ("나이"+ age);
		 * Sysout ("키"+ ki);
		 * Sysout ("몸무게"+weight);
		 * Sysout ("성별"+ gender);
		 * Sysout ("돈"+ money);**/
		System.out.println("=====프로그램 종료=====");
		
		
		

	}

}

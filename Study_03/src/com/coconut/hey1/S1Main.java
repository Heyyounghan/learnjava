package com.coconut.hey1;

import java.util.Scanner;

public class S1Main {

	public static void main(String[] args) {
		
		System.out.println("S1Main 실행");
	
		
		//변수 선언 공식
		// 데이터타입 변수명 ; >> 
		//객체 생성 공식
		// 클래스명 변수명 = new 클래스명(); 
		Member m= new Member();
		Member m2= new Member();
		
		int n=10;
		int [] ar= new int[2];
		
		Scanner sc= new Scanner(System.in);
		
		m.id="test";
		m.pw="password";
		m.age= 20;
		m.height= 182.25;
		
		m2.id="test";
		m2.pw="password";
		m2.age= 20;
		m2.height= 182.25;
		
		
		System.out.println(m.id);
		System.out.println(m.pw);
		System.out.println(m2.age);
		System.out.println(m2.height);
		
		m=m2;
		
		System.out.println(m==m2);
		m.id= m2.id;
		

	}

}

package com.coconut.hey6;

import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {
		// 하나의 변수로 여러개의 데이터
		Scanner sc= new Scanner(System.in);
		int age=20;
		int age2= 23;
		int age3= 30;
		 
		// 배열 선언
		int [] ages;
		
		//배열 생성
		ages= new int[3];
		
		//선언과 동시에 생성 
		int [] ages2= new int[3];
		
		int [] ages3= {20, 10,40,50,23,44,533,22};
		
		
		System.out.println(ages3[0]);
		System.out.println(ages3[2]);
		
		System.out.println("인덱스 번호를 입력하세요.");
		int index= sc.nextInt();
		
		System.out.println(ages3[index]);
		
	

	}

}

package com.coconut.hey5;

import java.util.Scanner;

public class Loop_01_ex2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("0초부터 60미만의 초를 입력하세요.");
		//초 입력
		int second= sc.nextInt();
		
		
		for(int i=0; i<60; i++){
			
			System.out.println(i);
			if(i==second) {
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}

}

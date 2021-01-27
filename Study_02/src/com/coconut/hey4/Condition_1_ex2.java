package com.coconut.hey4;

import java.util.Scanner;

public class Condition_1_ex2 {

	public static void main(String[] args) {
		/**
		 * 키보드로부터 입력받기
		 * 국, 영, 수를 입력받는다.
		 * 총점과 평균을 계산한다.
		 * 평균이 90점 이상이면 A를 출력
		 * 평균이 80점 이상이면 B를 출력
		 * 평균이 70점 이상이면 C를 출력
		 * 60점 이상이면 D
		 * 60점 미만이면 F를 출력.
		 * 단일 if문으로 만들기.
		 * */

		Scanner sc= new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요.");
		int kor= sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math= sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng= sc.nextInt();
		
		int total= kor+math+eng;
		double avg= total/3.0;
		
		System.out.println("총점: "+total);
		System.out.println("평균: "+avg);
		
		//점수
		char ch= 'F'; 
		// 초기값을 아예 F 로 두면 60점미만인 코드는 없어질 수 있다.
		
		if (avg>=90 && avg<101) {
			ch= 'A';
			
		}
		if (avg>=80 && avg<90) {
			ch='B';
			
		}
		if (avg>=70 && avg<80) {
			ch='C';
			
		}
		if (avg>=60 && avg<70) {
			ch='D';
			
		}
		/*if(avg<60){
			ch='F'; 초기값을 F로 변환시켜주면 아예 60점 미만은 F로 출력이 가능하다.
		}*/
		System.out.println(ch);
		System.out.println("프로그램을 종료합니다.");
		/* 내가 초반에 작성했던 코드 

		if (avg>89) {
			System.out.println("A");
			
		}
		if (avg>79) {
			System.out.println("B");
			
		}
		if (avg>69) {
			System.out.println("C");
			
		}
		if (avg>59) {
			System.out.println("D");
			
		}else{
			System.out.println("F");
		}
		*/
		/*
		if (avg>=90) {
			System.out.println("A");
		}
		else if (avg>=80) {
			System.out.println("B");
		}
		else if (avg>=70) {
			System.out.println("C");
		}
		else if (avg>=60) {
			System.out.println("D");
		}
		else if (avg<=59) {
			System.out.println("F");
		}else {
			System.out.println("다시");
		}*/
	

	}

}

package com.coconut.hey4;

import java.util.Scanner;

public class Condition_1_ex1 {

	public static void main(String[] args) {
		// 오늘의 예제 , 합계와 평균내는것
		/*
		 * 키보드로부터 (국어,영어,수학) 점수를 입력받는다.
		 * 점수 세 개의 총점과 평균을 계산한다.
		 * 평균이 90이상= 우수학생/ 90이하 = 졸업만 출력
		 * 졸업을 출력한다.
		 * */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("국어 점수를 입력해주세요.");
		int korean= sc.nextInt();
		System.out.println("수학 점수를 입력해주세요.");
		int math=sc.nextInt();
		System.out.println("영어 점수를 입력해주세요.");
		int english= sc.nextInt();
		
		//총점
		int sum= korean+math+english;
		//평균
		double avg= sum/3;
		
		if (avg>=90) {
			System.out.println("우수학생입니다.");
		}else {
			System.out.println("졸업입니다.");
		}
		
		System.out.println("총점:"+sum);
		System.out.println("평균:"+avg);
		

	}

}

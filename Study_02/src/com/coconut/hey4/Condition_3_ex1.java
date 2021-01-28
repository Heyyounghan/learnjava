package com.coconut.hey4;

import java.util.Scanner;

public class Condition_3_ex1 {
	
	
	public static void main(String [] args){
		//국영수 입력받고 총점 평균을 계산한다.
		/*
		 * 90=a / 80=b/70=c/60=d/그외는 f*/ 
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요");
		int kor= sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int math= sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int eng= sc.nextInt();
		
		//총점
		int sum= kor+math+eng;
		
		//평균
		double avg= sum/3.0;

		System.out.println("평균:"+avg);
		if (avg>=90) {
			System.out.println("성적 A");
		}else if(avg>=80) {
			System.out.println("성적 B");
		}else if(avg>=70) {
			System.out.println("성적 C");
		}else if(avg>=60) {
			System.out.println("성적 D");
		}else {
			System.out.println("성적 F");
		}
	}

}

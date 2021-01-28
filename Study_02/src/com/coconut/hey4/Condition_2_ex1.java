package com.coconut.hey4;

import java.util.Scanner;

public class Condition_2_ex1 {

	public static void main(String[] args) {
		// 국어영어수학입력받아서
		//총점과 평균 계산
		//60점 이상이면 합격 아니면 불합격 
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요");
		int kor= sc.nextInt();
		System.out.println("영어 점수를 입력해주세요");
		int eng= sc.nextInt();
		System.out.println("수학 점수를 입력해주세요");
		int math= sc.nextInt();
		
		int total= kor+eng+math;
		double avg= total/3;
		boolean check=false;
		
		System.out.println("평균은"+avg+"점 입니다.");
		if(avg>59) {
			check=true;
			//System.out.println("합격");
		}else {
			check=false;
			//System.out.println("불합격");
		} // 40점 미만이면 불합격
		
		if(eng>40 || kor>40 || math>40) {
			check=false;
		}
	
		
		if(check==true){
			System.out.println("합격");			
		}else {
			System.out.println("불합격");
		}

	}

}

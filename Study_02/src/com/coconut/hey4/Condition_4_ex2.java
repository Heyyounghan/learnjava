package com.coconut.hey4;

import java.util.Scanner;

public class Condition_4_ex2 {

	public static void main(String[] args) {
		//의도적으로 break를 쓰지 않는 경우.
		// 국어영어수학 총점 평균 계산하기
		//90점 ^ A/80^B/70^C/60^D/F
		
		
		Scanner sc= new Scanner(System.in);
			
		System.out.println("국어 점수를 입력해주세요");
		int kor=sc.nextInt();
		System.out.println("수학 점수를 입력해주세요");
		int math= sc.nextInt();
		System.out.println("영어 점수를 입력해주세요");
		int eng= sc.nextInt();
		
		//총점
		int total= kor+math+eng;
		//평균
		int avg= total/3;
		System.out.println("총점:"+avg);
		
		
		switch (avg/10) {
		// 공통적인 패턴.
		
		case 10: // 똑같은 코드를 출력할때 의도적으로 break를 제거해서 사용 가능함.
		case 9:
			System.out.println('A');
			break;
		case 8:
			System.out.println('B');
			break;
		case 7:
			System.out.println('C');
			break;
		case 6:
			System.out.println('D');
			break;
		default:
			System.out.println("F");
		
		}
		
		

	}

}

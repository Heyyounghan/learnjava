package com.coconut.hey5;

import java.util.Scanner;

public class Loop_01_ex3 {

	public static void main(String[] args) {
		// 세 과목을 입력받는 코드를 반복문 안에 구성
		// 점수를 입력받고 누적으로 총점 계산
		// 몇번 돌았는지.. 
		
		Scanner sc= new Scanner(System.in);
		//출력할 총점
		int total= 0;
		System.out.println("과목 수를 입력하세요.");
		int count= sc.nextInt();
		
		for(int i=0;i<count;i++) {
			// 점수 입력하기.
			System.out.println("점수를 입력하세요.");
			int kor= sc.nextInt();			
			total= total+kor;
			System.out.println();
		}
		
		System.out.println("총점: "+total);

	}
	
	

}

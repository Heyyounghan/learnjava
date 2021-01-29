package com.coconut.hey5;

import java.util.Scanner;

public class Loop_03_ex3 {

	public static void main(String[] args) {
		// 캐릭터마다 탄창을 3개 지급 : 입력횟수는 3번 
		// 탄창 1개당 총알이 30개가 들어감. 출력해야하는 문자 30 
		//단발? 혹은 점사로 쏠지 결정 조건문 
		// 단발 선택시 탕이라는 출력문이 30번 나감
		//점사 선택시 타타탕 이라는 출력문이 10번 나감 탄창을 비우면 단발인지 점사인지 결정

		Scanner sc= new Scanner(System.in);

		//장전 횟수 초기화 시키기 
		int j=0;

		for(j=1;j<=3;j++) {
			//단발과 점사의 결정 
			System.out.println("1.단발 / 2. 점사");
			int m=sc.nextInt();
			if(m==1) {//단발

				for(int i=1; i<=30;i++) {
					System.out.println(i+"탕");
									}
			}
			else if(m==2) { // 점사
				for (int i=1; i<=10; i++) {
					System.out.println(i+"타타탕");
				}
			}
		}
		System.out.println("탄창 소진 끝!");
		
	}

}

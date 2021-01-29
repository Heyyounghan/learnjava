package com.coconut.hey5;

import java.util.Scanner;

public class Loop_03_ex2 {

	public static void main(String[] args) {
		// 0시 0분 
		// 0시 1분 .... 23시 59분 이중포문 써서 23시 59분까지 찍기.
		//시와 분을 입력받아 출력하고 입력한 시 분이 되면 프로그램 종료 
		//if 체크가 트루라면 ??? 

		Scanner sc= new Scanner(System.in);
		System.out.println("입력해주세요.");
		int hour=sc.nextInt();
		System.out.println("입력 고고 ");
		int min=sc.nextInt();
		boolean check=false;


		for(int h=0;h<24;h++) { // 시간

			for(int m=0; m<60;m++) { // 분
				System.out.println(h+"시"+m+"분");
				
				if(hour==h && min== m) {
					check=true;
					break; // 해당포문만 .... 
				}
			}

			// 안쪽 for문이 종료되는 조건, 1. 60번을 다 돌은 경우, 2. 안쪽 for에서 break를 만든 경우 3. break를 만난 경우
			if(check) {
				break;
			}


		}

		System.out.println("프로그램 종료");
	}
}
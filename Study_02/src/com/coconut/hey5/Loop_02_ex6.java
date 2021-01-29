package com.coconut.hey5;

import java.util.Scanner;

public class Loop_02_ex6 {

	public static void main(String[] args) {
		// 구구단 출력
		// 단수를 입력받는다.
		// 3 * 1= 3; 으로 9행까지 출력
		Scanner sc= new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요. 구구단이 출력됩니다.");
		int n= sc.nextInt();
	
		for (int i=1; i<100;i++) {
			System.out.println(n+" * "+i+"="+n*i);
		}

	}

}

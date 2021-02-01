package com.coconut.hey6;

import java.util.Arrays;
import java.util.Scanner;

public class Array_04 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int [] ar= new int[5];
		
		//5개의 숫자를 입력받아 배열에 저장 
		//배열에 있는 데이터 모두 출력하기.
		
		
		//입력하기
		int index=0;
		
		for(index=0;index<5;index++) {
			ar[index]=sc.nextInt();
		}
		

		//출력하기.
		for(int i=0; i<ar.length;) {
			System.out.println(ar[i]);
			i++;
		}

		System.out.println(Arrays.toString(ar));
	}

}

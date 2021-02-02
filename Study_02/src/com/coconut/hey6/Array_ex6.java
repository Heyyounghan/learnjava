package com.coconut.hey6;

import java.util.Scanner;

public class Array_ex6 {

	public static void main(String[] args) {
		
		int [] ar= {1,2,3,4,5};
		int [] result= new int[ar.length-1]; // 네칸짜리 생성
		
		//지우고싶은 숫자를 입력하기.
		Scanner sc= new Scanner(System.in);
		
		//입력받을 숫자
		int n =sc.nextInt();
		
		//result에서 사용할 인덱스 번호
		int idx=0;
		
		//n과 ar[i]입력한게 같지않으면 배열에 넣어줌.
		for(int i=0; i<ar.length;i++) {	
			if (n==ar[i]) {
				System.out.println("find");
				continue;
			}		
			result[idx]= ar[i];
			idx++;
		}
		//얕은 복사
		ar=result;
		
				
		//System.out.println(ar.length); // 4
		//최종 결과
		
		for(int i=0; i<ar.length;i++) {
			System.out.println(ar[i]);//1,2,4,5
		}

	}

}

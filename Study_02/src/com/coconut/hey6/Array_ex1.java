package com.coconut.hey6;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		// 5개의 숫자를 입력받아 합계를 구하기
		
		
		Scanner sc= new Scanner(System.in);
		int result=0;
		
		System.out.println("생성할 배열의 수를 입력하세요.");
		int n= sc.nextInt();
		int [] arr= new int[n];
			
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+1+"번 숫자 입력");
			arr[i]= sc.nextInt();
			//result += arr[i];
			result= result+arr[i];
		}
		
		System.out.println(result);
		

	}

}

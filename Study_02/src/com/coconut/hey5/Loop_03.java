package com.coconut.hey5;

public class Loop_03 {

	public static void main(String[] args) {
		// 별찍기
		
		for(int i=0;i<5;i++) {
			System.out.println("*");
			
			for(int j=0; j<2;j++) {
				System.out.println("inner for");
			}
			
			System.out.println("\n");
			System.out.println("바깥 for문의 끝");
		}

	}

}

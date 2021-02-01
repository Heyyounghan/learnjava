package com.coconut.hey6;

public class Array_03 {

	public static void main(String[] args) {
		int [] ar= new int[3];
		double [] ar2= new double[2];

		ar[0]=1;
		ar[1]=30;

		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);

		//문자 4개를 담을 배열을 선언하고
		// 각 칸에 A부터 D까지 입력 대입.
		// 각 칸을 출력


		char [] alpha = new char[]{'a','b','c','d'};


		for(int j=0; j<alpha.length;){

			System.out.println(alpha[j]);
			j++;
		}

	}
}
package com.iu.s1.utill.random;

import java.util.Random;

public class Random_3 {

	public static void main(String[] args) {
		// 카카오페이
		
		int[] ar= {3, 22, 15, 800, 7, 61, 24, 27, 60, 0, 0, 1,7};
		
		Random random= new Random();
		
		int i= random.nextInt(ar.length);
		
		System.out.println(ar[i]);

	}

}

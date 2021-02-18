package com.iu.s1.utill.random;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {


		Random random= new Random();

		int  num= random.nextInt(45);
		int[] lotto= new int [6];
	
		for(int i=0; i<6;i++) {
			
			lotto[i]=num;
			
			System.out.print(lotto[i]+",");
		}

	}

}

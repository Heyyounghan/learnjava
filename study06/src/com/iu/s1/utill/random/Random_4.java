package com.iu.s1.utill.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Random_4 {

	public static void main(String[] args) {
		Random random= new Random();
		//ArrayList<Integer> lotto2 = new ArrayList<>();
		int[] lotto= new int[6];

		for(int i=0; i<6;i++) {

			int  num= random.nextInt(46);
			lotto[i]=num;

		}

		//HashSet<Integer> set = new HashSet<Integer>(lotto2);

		//ArrayList<Integer> lotto3 = new ArrayList<Integer>(set);



		for(int i=0; i<6;i++) {

			for(int j=0; j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}//if
			}//for
		}//for
		
		System.out.println(Arrays.toString(lotto));


	}

}
//if(lotto[i]!=lotto[i+1] ) {
//	nlotto[i]=lotto[i];
//	
//	
//}else {		
//	System.out.println(lotto);
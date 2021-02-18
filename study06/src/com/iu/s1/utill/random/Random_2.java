package com.iu.s1.utill.random;

import java.util.Random;

public class Random_2 {

	public static void main(String[] args) {
		//확률
		//10%확률로 A
		//30%확률로 B
		//60%확률로 C
		//70%확률로 D
		
		//random의 nextint랑 병합해서 프로그램짜기.
		
		Random random= new Random();	
		
		//공의 숫자
		int score = random.nextInt(10);
		
		if(score==0) {
			System.out.println("A");
		}else if(score>0 && score<4) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		
		
		
		
		
	}

}

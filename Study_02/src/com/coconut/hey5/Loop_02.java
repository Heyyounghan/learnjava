package com.coconut.hey5;

public class Loop_02 {

	public static void main(String[] args) {

		for(int i=0; i<100;i++) {

			if(i%2 !=0) {
				System.out.println("홀수");
				//바로 증감식가기.. 
				//continue;
				break;
			}

			System.out.println("i:"+i);
		}

	}

}

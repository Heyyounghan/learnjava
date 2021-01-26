package com.coconut.hey3;

public class Operator_03 {
	
	public static void main(String [] args) {
		
		// 총점을 담을 변수
		int total = 290;
		
		
		//평균을 담을 점수
		double avr =0.0;
		
		//과목은 3개 
		avr= (double)total/3; //96.66666666..		
		
		avr= avr*100;
		
		int result = (int)avr;
		avr = result/100.0;
		//최종 결과물 소숫점 두자리까지만 출력
		//System.out.println(String.format("%.2f", avr));
		//System.out.println(Math.floor(avr)); // 버림
		
		
		
		System.out.println(avr);
	}

}

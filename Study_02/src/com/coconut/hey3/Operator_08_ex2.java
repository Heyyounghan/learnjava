package com.coconut.hey3;

import java.util.Scanner;

public class Operator_08_ex2 {

	public static void main(String[] args) {
		//물건의 구매 가격을 입력한다
		//물건의 가격이 3만원 이상이면 5프로를 할인한다.
		//이하는 3프로를 할인한다.
		//택배비는 균등하게 2500원
		//최종출력은 물건할인된 최종가격과 택배비가 포함된 최종 가격을 출력
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("물건의 가격을 입력해주세요");
		
		//배송비
		int deliver= 2000;
		//가격 입력받기
		int price= sc.nextInt();
		
		//할인된 가격 결과
		double result = price>=30000 ? price*0.95 : price*0.97;
		/**
		 * 선생님의 코드
		 * int result=0;
		 * result= price>=30000*(int)(price-price*0.05):(int)(price-price*0.05)
		 * or
		 * discount = price>=30000? 0.05 : 0.03;
		 * result =(int)(price-price*discount);
		 * ---------------------------------------
		 * discount= price>=30000? 0.95:0.97;
		 * result= (int)price*discount;
		 * **/

		//가격 형변환 
		int result1 = (int)result;
		// 배송비 포함 가격 
		int finalPrice= result1+deliver;
		
		System.out.println("할인된 가격:"+result1);
		System.out.println("최종 가격(배송비포함)"+finalPrice);
		//Sysout("택배비포함:" +(result+2500));
		
	}

}

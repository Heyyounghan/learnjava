package com.coconut.hey3;

public class Operator_05 {

	public static void main(String[] args) {
		//물건의 총 합계금액 = total
		// 현금: 500000
		// 잔돈 총 합계금액 - total 
		// 만원: N장
		// 천원: N장
		// 백원: N장
		// 십원: N장
		
		//물건의 합계 금액
		int total = 24580;
		//낸 돈
		int cash = 100000;
		//잔돈 총액
		int result = cash-total;
		
		//만원권
		int cashManwon= result/10000;
		//천원권
		int cashCheonwon= (result-(cashManwon*10000))/1000;
		// result%10000/1000 => 
		//백원
		int cashBaekwon= ((result-(cashManwon*10000)-(cashCheonwon*1000)))/100;
		//result%1000/100=>
		//십원
		int cashTenwon= ((result-(cashManwon*10000)-(cashCheonwon*1000)-(cashBaekwon*100)))/10;
		//result%100/10=>
		
		System.out.println("물건의 합계 금액 :"+total);
		System.out.println("내가 낸 돈:"+cash);
		System.out.println("잔돈 총액:"+result);
		System.out.println("만원권 : "+cashManwon+"개");
		System.out.println("천원권 : "+cashCheonwon+"개");
		System.out.println("백원권 : "+cashBaekwon+"개");
		System.out.println("십원권 : "+cashTenwon+"개");
		

	}

}

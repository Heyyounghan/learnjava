package com.coconut.hey9;

public class Phone {
	
	int price;
	double point;
	
	public Phone() {
		//기본 default 생성자
		// 앞에 this 생략 
		price =200;
		this.point=3.3;
		
	}
	
	
	//1번
	
	public boolean check2(int price, double point) {
		//매개변수 price와 멤버 변수 price의 값이 같은지.
		
		if(this.price==price) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		return false;
		
	}

	//2번
	
	public boolean check(Phone phone) {
		
		boolean check= false;
		
		
		if(this.price == phone.price && this.point == phone.point) {
			check= true;
		}else {
			check= false;
		}
		
	
		return false;
	}
}

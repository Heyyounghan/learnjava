package com.panini.ex1;

public class Customer {
	
	private int money;
	private int point;
	
	
	public void buy(int price, int point) {
		this.money= this.money-price;
		this.point= this.point+point;
		System.out.println("현재 남은 금액: "+this.money);
		System.out.println("현재 포인트:"+this.point);
	}
	

}

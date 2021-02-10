package com.panini.ex1;

public class Customer {
	
	private int money;
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	private int point;
	
	
	//info를 변수화시켜서 넣으면..
	Phone ph= new Phone();
	DigitalDevice dd = ph;
	//dd.price
	
	public void buy(DigitalDevice product) {
		this.money= this.money-product.getPrice();
		this.point= this.point+product.getPoint();
		System.out.println("현재 남은 금액: "+this.money);
		System.out.println("현재 포인트:"+this.point);
	}
	

}

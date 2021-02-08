package com.coconut.hey9;

public class Car {		
	String company;
	String brand;
	String color;
	int door;

	//오버로딩 
	public Car() {
		//this() > 자기 자신을 의미. 잘 사용하지는 않음.
		this("black");
		System.out.println("Start");
		this.info();
		
		
	}
	//생성자
	public Car(String color) {
		//this를 쓰는게 코딩습관에 좋다.
		this("black", 5);
	}
	
	public Car(String color,int door) {
		this.company="AUDI";
		this.brand="K3";
		this.color=color;
		this.door=door;
		
	}
	

	public void info() {
		System.out.println("Company: "+this.company);
		System.out.println("Brand: "+this.brand);
		System.out.println("color: "+this.color);
		System.out.println("Door: "+this.door);
	}

}

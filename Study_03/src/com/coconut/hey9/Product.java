package com.coconut.hey9;

public class Product {
	
	String name;
	int price;
	
	
	//생성자 선언
	
	public Product() {
		System.out.println("Product Instance 생성 ");
		
	}
	public void info1() {
		
		System.out.println("info 1");
		System.out.println(this);
		System.out.println(this.name);
		System.out.println(this.price);
		this.info2(100);
	}
	
	public void info2(int price) {
		System.out.println("info2");
		System.out.println(name);
		System.out.println(price);
		System.out.println(this.price);
	}
	
	public void info3(Product product) {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(product.name);
		System.out.println(product.price);
	}

}

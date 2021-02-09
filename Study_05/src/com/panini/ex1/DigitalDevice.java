package com.panini.ex1;

public class DigitalDevice {
	
	private String company;
	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}


	private String brand;
	private int price;
	private int point;
	
	
	public void info() {
	}
		//추상 메서드이기 때문에 이 전체가 다 추상 메서드가 되어야한다.
	
	
	
	

}

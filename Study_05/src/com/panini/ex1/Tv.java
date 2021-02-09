package com.panini.ex1;

public class Tv extends DigitalDevice {
	
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	public Tv() {
		this.setCompany("samsung");
		this.setBrand("Oled");
		this.setPrice(300);
		this.setPoint(3);
		this.setSize(55);
	}
	
	@Override
	public void info() {
		System.out.println("company="+this.getCompany());
		System.out.println("Brand="+ this.getBrand());
		System.out.println("price="+this.getPrice());
		System.out.println("point="+this.getPoint());
		System.out.println("size="+this.getSize());

	}

}

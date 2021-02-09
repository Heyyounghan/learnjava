package com.panini.ex1;

public class Computer extends DigitalDevice {
	
	private String cpu;

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	//default 생성자
	
	public Computer() {
		this.setCompany("samsung");
		this.setBrand("Gram");
		this.setPrice(200);
		this.setPoint(2);
		this.setCpu("i5");
	}
	
	@Override
	public void info() {
		System.out.println("company="+this.getCompany());
		System.out.println("Brand="+ this.getBrand());
		System.out.println("price="+this.getPrice());
		System.out.println("point="+this.getPoint());
		System.out.println("CPU="+this.getCpu());

	}
	
	

}

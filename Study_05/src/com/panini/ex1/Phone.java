package com.panini.ex1;

public class Phone extends DigitalDevice {
	
	private String network;

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}
	
	public Phone() {
		this.setCompany("Apple");
		this.setBrand("iPhoe");
		this.setPrice(150);
		this.setPoint(1);
		this.setNetwork("KT");
		
	}
	
	@Override
	public void info() {
		System.out.println("company="+this.getCompany());
		System.out.println("Brand="+ this.getBrand());
		System.out.println("price="+this.getPrice());
		System.out.println("point="+this.getPoint());
		System.out.println("network="+this.getNetwork());

	}

}

package com.iu.weather;

public class WeatherView {
	
	public void view(String str) {
		System.out.println("----------------------");
		System.out.println(str);
		System.out.println("----------------------");
		
	}
	
	public void view(WeatherDTO[] ar) {
		
		System.out.println("City\t aircondition\t humiditu\t status");
		
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i].getCity()+"\t");
			System.out.print(ar[i].getAircondition()+"\t");
			System.out.print(ar[i].getHumidity()+"\t");
			System.out.println(ar[i].getStatus());
			System.out.println("=================================");
		}
		
	}
	
	public void view1(WeatherDTO[] ar) {
		// weatherdto 1개 출력 
		WeatherInfo wdinfo = new WeatherInfo();
		
		System.out.println("City\t aircondition\t humiditu\t status");
		System.out.print(ar.getCity()+"\t");
		System.out.print(ar.getAircondition()+"\t");
		System.out.print(ar.getHumidity()+"\t");
		System.out.println(ar.getStatus());
		
		
		
	}
	

}

package com.iu.weather;

public class WeatherView {
	
	public void view(String str) {
		System.out.println("----------------------");
		System.out.println(str);
		System.out.println("----------------------");
		
	}
	
	public void view(WeatherDTO w) {
		
		System.out.println("City\t aircondition\t humiditu\t status");
		
	
			System.out.print(w.getCity()+"\t");
			System.out.print(w.getAircondition()+"\t");
			System.out.print(w.getHumidity()+"\t");
			System.out.println(w.getStatus());
			System.out.println("=================================");
		
		
	}
	
	//메서드명 view
	//WeatherDTO들을 받아서 출력
	public void view(WeatherDTO [] ar) {
		System.out.println("City\t Gion\t Huminity\t State");
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i].getCity()+"\t ");
			System.out.print(ar[i].getAircondition()+"\t ");
			System.out.print(ar[i].getHumidity()+"\t\t ");
			System.out.println(ar[i].getStatus());
			System.out.println("---------------------------------------------");
		}
		
		
	}

}

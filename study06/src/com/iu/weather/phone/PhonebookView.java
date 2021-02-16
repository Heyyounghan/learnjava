package com.iu.weather.phone;

public class PhonebookView {
	
	
	public void view(PhonebookDTO[] phoneDTO) {
		System.out.println("Name\t number\t age\t job");
		
		for(int i=0; i<phoneDTO.length; i++) {
		System.out.print(phoneDTO[i].getName()+"\t");
		System.out.print(phoneDTO[i].getNumber()+"\t");
		System.out.print(phoneDTO[i].getAge()+"\t");
		System.out.println(phoneDTO[i].getJob());
		}
	
	}

}

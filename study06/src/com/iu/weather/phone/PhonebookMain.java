package com.iu.weather.phone;

public class PhonebookMain {

	public static void main(String[] args) {
		//1.phonebook을 초기화
		//2.phonebook을 출력
		//3.phonebook검색(이름)
		//v2. 추가 삭제 기능 
		//4. 종료
		
		PhonebookController pbc = new PhonebookController();
		//PhonebookInfo pbi = new PhonebookInfo();
		
		//pbi.makePhonebook();
		
		pbc.start();
		
		
		

	}

}

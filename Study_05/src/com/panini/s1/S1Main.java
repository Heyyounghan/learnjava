package com.panini.s1;

public class S1Main {

	public static void main(String[] args) {
		Magician magician = new Magician();
		Knight knight = new Knight();
		
		//knight.getSword().attack();
		magician.getStaff().attack();
		//Character charact = new Character(); // 추상클래스는 객체를 만들 수 없다.

		Sword sword = new Sword();
		Staff staff = new Staff();
		
		knight.setItem(sword);
		magician.setStaff(staff); //set staff 장비장착가능한 곳 , staff = 무기 = 장착
		
		
		

	}

}

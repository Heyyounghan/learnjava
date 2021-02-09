package com.panini.s1;

public class S1Main {

	public static void main(String[] args) {
		Magician magician = new Magician();
		Knight knight = new Knight();
		
		
		
		//Character charact = new Character(); // 추상클래스는 객체를 만들 수 없다.

		
		magician.setName("hyenini");
		magician.setHp(100);
		magician.setLevel(1);
		magician.setMp(100);
		
		magician.info();

		

	}

}

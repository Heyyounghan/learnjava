package com.panini.s1;

public class Magician extends Magic {
	//마법사
	//info를 상속받았음.
	//오버라이딩 부모로 받은 메서드를 자기 자신에게 맞게 재정의하는 것.
	
	private Staff staff;

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	

}

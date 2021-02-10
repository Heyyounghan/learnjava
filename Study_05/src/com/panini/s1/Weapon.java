package com.panini.s1;

public abstract class Weapon implements Item { // 구현(implement) 아이템을 가지고 온거임..
	
	//interface 는 추상클래스이기때문에 implement를 하면 abstract를 필수로 붙여줘야함... 
	
	
	private String name;
	private int damage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	

}

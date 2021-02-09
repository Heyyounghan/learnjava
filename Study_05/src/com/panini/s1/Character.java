package com.panini.s1;

public abstract class Character {
	//super class
	//공통 요소 선언
	private String name;
	private int hp;
	private int level;
	
	public Character() {}
	public Character(String name) {
		this.name= name;
		
	}
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getHp() {
		return hp;
	}




	public void setHp(int hp) {
		this.hp = hp;
	}




	public int getLevel() {
		return level;
	}




	public void setLevel(int level) {
		this.level = level;
	}




	public void info() { 
		//완성되지 않은 메서드라는 의미.

	}
}

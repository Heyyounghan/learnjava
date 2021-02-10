package com.panini.s1;

public class Staff extends Weapon {
	
	@Override
	public void attack() {
		this.spell();
		
	}
	
	public void spell() {
		
		System.out.println("Spell!");
	}

}

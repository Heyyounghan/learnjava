package com.panini.s1;

public class Sword extends Weapon {
	
	@Override
	public void attack(){
		this.slash();
		
	}
	
	public void slash() {
		System.out.println("slash");
	}
	
	
	
	

}

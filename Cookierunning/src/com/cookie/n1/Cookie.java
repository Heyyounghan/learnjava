package com.cookie.n1;

public class Cookie implements Skill {
	
	private int hp;
	private String name;
	
	public int total; // 획득한 젤리 점수
	
	
	//쿠키에 대한 정보
	
	
	public Cookie() {
		//생성자로 기본 값 설정하기.
		this.hp= 50;
		this.name= "용감한쿠키";
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
	//스킬
	@Override
	public void runs() {
		System.out.println("달리기");
	}
	
	
	@Override
	public void jump() {		
		System.out.println("점프!");
		
	}
	
	@Override
	public void doublejump() {
		System.out.println("더블 점프!");
	}
	
	@Override
	public void underfloor() {
		System.out.println("바닥쓸기!");
	}
	
	

}

package com.coconut.hey3;

public class ExMain1 {

	public static void main(String[] args) {
		//캐릭터 모델링하기 게임 제작
		
		Character ch= new Character();
		
		ch.name="춘식이";
		ch.hp= 100;
		ch.sword= new Sword();
		ch.sword.name="엑스칼리버";
		
		
		System.out.println(ch.name);
		System.out.println(ch.hp);
		System.out.println(ch.sword);
		System.out.println("sword:"+ch.sword.name);
		
		
		

	}

}

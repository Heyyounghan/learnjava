package com.cookie.n1;

import java.util.Scanner;

public class CookieController {
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		
		Cookie cookie= new Cookie();
		
		Field field = new Field();
		
		
		field.startparty();
		
		//쿠키 이름 입력 
		cookie.setName(sc.next());

		
		System.out.println("======내 정보=====");
		System.out.println("hp: "+ cookie.getHp());
		System.out.println("이름: "+cookie.getName());
		System.out.println("=================");
		
		
		System.out.println("게임을 시작하시겠습니까? ");
		System.out.println("1. 게임 시작 ");
		System.out.println("2. 게임 종료 ");
		
		//설정 
		int sel = sc.nextInt();
		
		switch(sel) {
		
		case 1:
			
			System.out.println("달리기를 시작합니다.");
			Running run = new Running();
			run.runrun();
			
			break; 
			
		case 2:
			
			System.out.println("게임을 종료합니다.");
			break;
		
	
		}
	}

}

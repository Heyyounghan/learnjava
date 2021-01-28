package com.coconut.hey4;

import java.util.Scanner;

public class Condition_4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1~3 숫자를 한 개 입력해주세요.");
		
		int select= sc.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("1번 입니다.");
			break;
		case 2:
			System.out.println("2번입니다.");
			break;
		case 3:
			System.out.println("3번 입니다.");
			break;
			
		default:
			System.out.println("유효하지않습니다.");
				
		}

	}

}

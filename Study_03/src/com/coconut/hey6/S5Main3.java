package com.coconut.hey6;

import java.util.Scanner;

public class S5Main3 { //강사님 코드

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("제작할 핸드폰의 개수를 입력하세요.");
		 //갯수 입력
		int n= sc.nextInt();
		sc.nextLine();
		//핸드폰의 갯수만큼 정보를 입력ㄴ
		Phone[] phones =new Phone[n];
		
		for(int i=0;i<phones.length;i++) {
			Phone phone= new Phone();			
			System.out.println("회사를 입력하세요");
			phone.company=sc.nextLine();
			System.out.println("이름를 입력하세요");
			phone.name=sc.nextLine();
			System.out.println("가격을 입력하세요.");
			phone.price=sc.nextInt();
			sc.nextLine();
			System.out.println("색깔을 입력하세요.");
			phone.color=sc.nextLine();
			phones[i]=phone;
			
		}
		
		Test t1= new Test();
		
		t1.info4(phones);
		

	}

}

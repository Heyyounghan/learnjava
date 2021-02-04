package com.coconut.hey6;

import java.util.Scanner;

public class S5Main2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("제작할 핸드폰의 개수를 입력하세요.");
		 //갯수 입력
		int n= sc.nextInt();
		//핸드폰의 갯수만큼 정보를 입력
		Phone phone= new Phone();
		
		String [] company= new String[n];
		String [] name= new String[n];
		int [] price= new int[n];
		String [] color= new String[n];
		
		for(int i=0;i<company.length;i++) {
			System.out.println("이름을 입력하세요");
			phone.name=sc.next();
			name[i]=phone.name;
			System.out.println("회사를 입력하세요");
			phone.company=sc.next();
			company[i]=phone.company;
			System.out.println("가격을 입력하세요.");
			phone.price=sc.nextInt();
			price[i]=phone.price;
			System.out.println("색깔을 입력하세요.");
			phone.color=sc.next();
			color[i]= phone.color;
		}
		
		Test t1= new Test();
		
		t1.info3(company, name,price,color);

		
		

	}

}

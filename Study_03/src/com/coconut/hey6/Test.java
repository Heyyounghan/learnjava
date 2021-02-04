package com.coconut.hey6;

public class Test {
	
	//info3 메서드작성
	//핸드폰가격의 총 합/ 모든 핸드폰의 정보 출력, 
	public void info3(String[] company,String[] name,int[] price,String[] color) {
		
		//모든 핸드폰의 정보 출력하기
		for(int i=0; i<company.length; i++) {
			System.out.println("회사: "+ company[i]+" |이름: "+ name[i]+" |가격: "+ price[i]+" |색깔: "+ color[i]);
		}
		
		int result=0;
		//모든 가격의 총합 구하기
		for(int i=0; i<company.length;i++) {
			result= result+price[i];
		}
		
		System.out.println("핸드폰의 가격은 총 "+result+" 원 입니다.");
		
	}
	
	
	//info3 강사님의 
	public void info4(Phone[] phones) {
		
		for(int i=0; i<phones.length; i++) {
			System.out.println("회사: "+ phones[i].company+" |이름: "+ phones[i].name+" |가격: "+ phones[i].price+" |색깔: "+ phones[i].color);
		}
		int result=0;
		//모든 가격의 총합 구하기
		for(int i=0; i<phones.length;i++) {
			result= result+phones[i].price;
		}
		
		System.out.println("핸드폰의 가격은 총 "+result+" 원 입니다.");
		
	}
	

	public void t1(int num) {
		num = num*3;
		System.out.println(num);
	}


	public void information(Phone phone) { // 매개변수를 한개만 선언해서 다 출력하기.
		System.out.println("company:"+phone.company);
		System.out.println("name:"+ phone.name);
		System.out.println("color:"+phone.color);
		System.out.println("price: "+ phone.price);
		phone.company="Google";
	}
	//info 2 메서드명
	// 배열에 있는 데이터를 모두 출력하는 것.

	public void info2(int [] ar) {
		for(int i=0;i<ar.length; i++) {
			System.out.println(ar[i]);
			}
		}
	



}

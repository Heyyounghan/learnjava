package com.coconut.hey6;

public class S5Main {

	public static void main(String[] args) {
		Test test= new Test();
		int num=10;
		test.t1(num);
		System.out.println("main :"+ num);
		
		Phone phone= new Phone();
		
		phone.company="삼성";
		phone.color="RED";
		phone.name="S21";
		phone.price=200;
		
		test.information(phone);
		System.out.println("--------------------------------");
		
		System.out.println(phone.company);
		
		System.out.println("---------------------------------");
		int [] ar= {1,2,3};
		
		test.info2(ar);
		


	}

}

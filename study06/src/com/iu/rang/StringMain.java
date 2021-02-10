package com.iu.rang;

public class StringMain {

	public static void main(String[] args) {
		
//		String s1= " ";
//		
//		String s2= new String();
//		
//		String s3= new String("HelloWorld");
//		
//		//char At 호출하고 결과물을 출력
//
//		System.out.println(s1);
//		System.out.println(s3.charAt(-1));
//		System.out.println(s3);

		
		Stringex1 st1= new Stringex1();
		
		//st1.ex1();
		//st1.Ex2();
		
		String str1= "ui";
		String str2= "ui";
		String str3= new String("ui");
		String str4= new String("ui");
		
		 // String class 는 불변이다.
		// 
				
//		System.out.println(str1 == str2);
//		System.out.println(str3 == str4);
//		System.out.println(str1.equals(str3));
//		// equals => Object type넣기
		
		MyClass m1= new MyClass();
		MyClass m2= new MyClass();
		m1.num=1;
		m2.num=1;
		
		m1.name= "niniz";
		m2.name= "niniz";
		
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
		m1.equals(m2);
		
		Object obj= m2;
		MyClass m3= (MyClass)obj;
		m3.name="heniz;";
		
		
	}

}

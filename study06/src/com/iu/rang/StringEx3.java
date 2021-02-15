package com.iu.rang;

public class StringEx3 {

	public static void main(String[] args) {
		
		
		//String str1= new Sting("Hello world");와 동일하다는 의미.
		String str1= "Hello World"; //오른쪽부분이 객체! 왼쪽은 참조변수 
		String str2= null;
		
		str2= str1.replace('l','A' );
		System.out.println(str1);
		System.out.println(str2);
		
		Object obj = new Object();
		System.out.println(obj.toString());
		System.out.println(obj);
		System.out.println(str1.toString());
		System.out.println(str1);
		
		int num=10;
		String str3 = String.valueOf(num);
		
		String[] strindex= {"a","b","c"};
		str3= "hello world";
		str3= str3.substring(6,8);
		System.out.println(str3);

	}

}

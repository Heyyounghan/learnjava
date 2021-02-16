package com.iu.slang.math;

public class Math_1 {

	public static void main(String[] args) {
		
		double d= 3.12345;
		
		d=Math.ceil(d); //올림 
		
		System.out.println(d);
		
		d= 3.555;
		
		d=Math.floor(d);
		
		System.out.println(d); // 내림
		
		d=3.1678;
		
		d= Math.round(d);
		System.out.println(d); //반올림 
		
		d=Math.random();
		System.out.println(d);
		

	}

}

package com.iu.rang;

public class StringEx6 {

	public static void main(String[] args) {
		String str= "t1, t2,t3";
		//.split 
		
		String[] ar= str.split(",");
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);

	}

}

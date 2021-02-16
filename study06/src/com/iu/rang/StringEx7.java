package com.iu.rang;

public class StringEx7 {
	
	
	public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer();
		
		sb.append("Hello");
		sb.append("WOrdld"); // append 덮어쓰기. 
		
		String buff= sb.toString();
		System.out.println(buff);
		
		sb=sb.reverse(); //거꾸로 뒤집는것. 
				
	System.out.println(sb);
		
	}
}

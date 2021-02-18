package com.iu.s1.utill.token;

import java.util.StringTokenizer;


public class Token_1 {

	public static void main(String[] args) {
		String str= "iu-suji-mini";
		
		StringTokenizer st= new StringTokenizer(str, "-");
		
		int count=st.countTokens();
		System.out.println(count);
		
		while(st.hasMoreTokens()) {
			String name= st.nextToken();
			System.out.println(name);
		}
		

	}

}

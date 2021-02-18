package com.iu.s1.utill.token;

import java.util.StringTokenizer;



public class Token_2 {

	public static void main(String[] args) {
		String str = "mimi-20-sina-33-lily-22";
		
		
		StringTokenizer st= new StringTokenizer(str,"-");
		while(st.hasMoreTokens()) {
			String name= st.nextToken();
			String age= st.nextToken();
		}
		

	}

}

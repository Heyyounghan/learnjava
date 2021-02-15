package com.iu.rang;

import java.util.Arrays;
import java.util.Scanner;

public class StringEx4 {

	public static void main(String[] args) {
		String str= "hello,world,My Country";
		/*
		 * str1에는 hello  / str2에는 world */
		
		String str1=str.substring(0,5);
		String str2=str.substring(6, 11);
		
		System.out.println(str1);
		System.out.println(str2);
		
//		int index=str.indexOf(",");
//		String str31=str.substring(0,index);
//		index= str.indexOf(",");
//		int endinex=str.indexOf(",",index+1);
//		System.out.println(str1);
//		System.out.println(str2);
		//2. Scanner로 받은 문자열을 기준으로 잘라서 출력
		
		Scanner sc= new Scanner(System.in);
		
		String strr= sc.next();
		
//	String[] strr1= strr.split(",");
		
		
//		System.out.println(strr1[0]);
//		System.out.println(strr1[1]);
//		System.out.println(Arrays.toString(strr1));
		
		boolean check= true;
		int startIndex=0;
		int lastIndex=0;
		
		 while(check){
		 
			 lastIndex= strr.indexOf(",",startIndex); // 4
			 
			 if (lastIndex == -1) {
				 str1= strr.substring(startIndex);
				 check=false;
			 }else {
				 str1= strr.substring(startIndex);
			 }
			// str1= strr.substring(startIndex,lastIndex);
			 System.out.println(str1);
			 startIndex=lastIndex+1;//5
		 }



	}

}

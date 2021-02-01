package com.coconut.hey6;

import java.util.Scanner;

//import java.util.Arrays;



public class Array_ex2 {

	public static void main(String[] args) {
		// 학생 수를 입력받기.
		// 학생수 만큼 이름을 입력
		// 입력이 끝나면 학생 이름들을 출력하면된다.
		// 학생의 수 만큼 학번 입력받기.
		// 3. 학생별로 국어영어수학점수입력받기.
		// 이름: 번호: 국어:영수	
		
		Scanner sc= new Scanner(System.in);
		// 학생 수
		int s= sc.nextInt();
		
		//이름 담을 배열 선언하기
		String [] name= new String[s];
		//번호를 담을 배열 선언하기.
		int [] number= new int[name.length];
		int i=0;
		
		//국어
		int [] kor= new int[name.length];
		//영어
		int [] eng= new int[name.length];
		//수학
		int [] math= new int[name.length];

		System.out.println("이름 입력하기.");
		//학생들 입력받기
		for( i=0; i<name.length;i++) {
			// 입력받은 이름 배열에 넣기. 
			name[i]= sc.next();		
		}
		for( i=0; i<number.length; i++) {
			System.out.println("학번 입력하기");
			number[i]= sc.nextInt();
		}
		for( i=0; i<number.length; i++) {
			System.out.println(name[i]+" 의 국어 입력하기");
			kor[i]= sc.nextInt();
			System.out.println(name[i]+"영어 입력하기");
			eng[i]= sc.nextInt();
			System.out.println(name[i]+"수학 입력하기");
			math[i]= sc.nextInt();
		}
		for(i=0; i<number.length;i++) {
			System.out.println("이름:"+name[i]+" 학번:"+number[i]+"국어: "+kor[i]+"영어: "+eng[i]+"수학: "+math[i]);
		}
		
		
		//System.out.println(Arrays.toString(name));
	}

}

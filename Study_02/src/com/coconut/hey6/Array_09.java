package com.coconut.hey6;

import java.util.Scanner;

public class Array_09 {

	public static void main(String[] args) {
		
		//이차원배열 가변 배열
		Scanner sc= new Scanner(System.in);
		int [][] ars= new int[2][];
		
		ars[0]= new int[3];
		ars[1]= new int[2];
		
		for(int i=0;i<ars.length;i++) {
			for(int j=0; j<ars[i].length;j++) {
				System.out.println("입력");
				ars[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<ars.length;i++) {
			for(int j=0; j<ars[i].length;j++) {
				System.out.println(ars[i][j]);
				
			}
		}
		



		
	}

}

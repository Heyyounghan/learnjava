package com.coconut.hey6;

public class Array_08 {

	public static void main(String[] args) {

		int [] ar= {1,2,3};
		int [] ar2= {4,5,6};
		//모으려고하는 데이터타입 [] 변수명= new 모으려고하는 데이터타입[?];
		// 이중 배열 : 배열을 모으는 배열, 
		// new [전체 모을 갯수][각 배열의 크기]

		int [][] ars= new int[2][3] ;

		ars[0]=ar;
		ars[1]=ar2;

		
		for(int i=0;i<ars.length;i++) {
			for(int j=0; j<ars[i].length;j++) {
				System.out.println(ars[i][j]);
				
			}
		}
	}

}

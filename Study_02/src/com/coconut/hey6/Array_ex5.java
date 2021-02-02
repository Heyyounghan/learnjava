package com.coconut.hey6;

public class Array_ex5 {

	public static void main(String[] args) {
		
		int [] ar= {1,2,3,4,5};
		
		int [] ar2= new int [4];
		
		
		//ar 배열은 4칸으로 수정하는 코드 작성 
		
		for(int i=0; i<ar2.length;i++) {
			ar2[i]=ar[i];
		} 
		
		//배열 초기화
		//ar= new int [4]; (내코드, 아래껀 선생님코드.)
		 ar= ar2;
		
		//배열값 다시 넣어주기
		//for(int i=0; i<4;i++) {
		//	ar[i]=ar2[i];
		//} 
		
		// 출력
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]); //1,2,3,4
		}

	}

}

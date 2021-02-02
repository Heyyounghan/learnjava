package com.coconut.hey6;

public class Array_07 {

	public static void main(String[] args) {
		//
		
		int [] ar= {10,22,33}; 
		System.out.println(ar[0]);

		
		int [] ar2= ar; // 얕은 복사 
		
		ar2[1]=222;
		System.out.println(ar2[1]); //10
		
		ar2= new int[3];
		
		ar2[1]=444;
		System.out.println(ar[1]);
		
		//깊은 복사 
		for(int i=0; i<ar.length;i++) {
			ar2[i]=ar[i];
		} 
		for(int i=0; i<ar.length;i++) {
			System.out.println("ar:"+ar[i]);
			System.out.println("ar2:"+ar2[i]);
		} //깊은 복사 와 얕은 복사의 차이 얕은 복사는 하나의 배열울 주소만 복사해서 같이본다.
		// 깊은 복사는 주소값을 복사하는게 아니라 배열 자체를 복사하는 것.
		
		ar2[1]=0;
		System.out.println(ar[1]);
		
		
	}

}

package com.coconut.hey6;

public class Array_ex7 {

	public static void main(String[] args) {

		int [] ar= {5,3,2,7,6};
		//연습문제 숙제
		//이중 포문 사용해야한다.

		for(int i=0; i<ar.length;i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]>ar[j]) {
				int temp= ar[j];
				ar[j]=ar[i];
				ar[i]=temp;
			}else {
				break;
			}

		}
	}


	//최종 출력 2,3,5,6,7 오름차순 정렬하기.
	for(int i=0; i<ar.length; i++) {
		System.out.println(ar[i]);
	}


}
}


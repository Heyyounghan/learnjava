package com.coconut.hey7;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// makearray 호출하기
		ReturnTest2 rt2= new ReturnTest2();
		//rt2.makeArray(); //배열을 생성하기 
		Scanner sc= new Scanner(System.in);
		
		// 받은 배열에 데이터를 입력하면 된다.		
		// viewArray를 호출	-> 데이터 입력하기
		//rt2.viewAraray(rt2.makeArray());
		// 배열 보내기 -> 데이터 출력
		
		int [] ar= rt2.makeArray();
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(i+1+"번째 숫자입력");
			ar[i]=sc.nextInt();
		}
		
		
		rt2.viewAraray(ar);

//코드의 유지보수성을 중요하게 여길 것, 
		//  addarray호출, viewarray 호출
		
		ar= rt2.addArray(ar);

		rt2.viewAraray(ar);
		
		ar= rt2.removeArray(ar);
		
		rt2.viewAraray(ar);
		// removeadday호출 + viewarray호출

	}

}

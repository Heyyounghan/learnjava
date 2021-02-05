package com.coconut.hey7;

import java.util.Arrays;
import java.util.Scanner;

public class ReturnTest2 {


	//메서드명은 make Array
	//배열의 크기를 입력받기
	// 입력받은 숫자만큼 정수를 담을 배열을 생성하여 리턴한다.

	public int[] makeArray() {
		Scanner sc= new Scanner(System.in);

		//숫자 입력받기.
		System.out.println("숫자를 입력해주세요.");
		int n= sc.nextInt();

		//입력받은 숫자만큼 배열을 생성한다.
		int [] ar= new int[n];


		return ar; // 배열 리턴하기.

	}

	// 또다른 메서드명은 view Array , 
	// 매개 변수로 정수 배열을 선언한다.
	// 배열에 들어있는 데이터를 출력한다.


	public void viewAraray(int [] arr) {

		//System.out.println("배열 값을 입력하세요.");
		//Scanner sc= new Scanner(System.in);

		for(int i=0; i<arr.length; i++) {
			//int s= sc.nextInt();
			//arr[i]= s;
			System.out.println(arr[i]);

		}
	}
	//System.out.println(Arrays.toString(arr));

	/*
	 * 메서드 명은 addarray
	 * 매개변수로 정수 배열을 받는다.
	 * 해당 배열에 한 칸을 추가하고 데이터를 입력한다.
	 * 추가된 배열을 리턴한다. */

	public int[] addArray(int [] ar) {
		//배열을 받는다. 
		Scanner sc= new Scanner(System.in);
		int[] ar3= new int[ar.length+1]; //증가배열 선언
		
		for(int i=0; i<ar.length;i++) {
			ar3[i]=ar[i]; // 복사
			}
		System.out.println("추가할 배열을 입력하세요.");
		ar3[ar3.length-1]= sc.nextInt(); // 숫자입력
		
		
		return ar3; // 추가된 배열
	}

	/*
	 * removeArray
	 * 매개변수로 정수를 받는다.
	 * 삭제하고싶은 숫자를 입력받는다.
	 * 해당 칸을 삭제한다. 삭제된 배열을 리턴
	 * 
	 * */
	public int[] removeArray(int[] ar) {
		Scanner sc= new Scanner(System.in);
		int [] result= new int[ar.length-1];
		int a= sc.nextInt(); //입력받을 숫자
		//삭제 배열
		
		System.out.println("삭제할 배열을 입력하세요.");
		//변수 입력
		int s = sc.nextInt();
		int j=0;
		
		for(int i=0; i<ar.length;i++) {
			if(s==ar[i]) {
				System.out.println("삭제.");
				continue;
			}
			result[j]=ar[i];
			j++;
		} // 복사
		
		// ar= result; 얕은 복사 덮어씌우기.
		
		return result;
		/*강사님의 코드
		 * int idx= -1;
		 * int [] result= new int[ar.length-1];
		 * for(int i=0; i<ar.length; i++){
		 * 	if(ar[i]==num){
		 * 		idx=1;
		 * 		break 
		 *  }//if
		 * }//for
		 * 
		 * if(idx !=-1){
		 * //삭제할 인덱스 번호가 있다.
		 *  int [] result= new int[ar.length-1];
		 *  int index= 0;
		 * for(int=0; i<ar.length; i++){
		 * result[index]=ar[i];
		 * index++;
		 * }
		 * 
		 *  result[i]= ar[i];
		 *  i++
		 * }
		 * */
		
	}
}



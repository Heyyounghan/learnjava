package com.iu.rang;

import java.util.Arrays;
import java.util.Scanner;

public class StringEx5 {

	public static void main(String[] args) {
		//파일명을 확장자포함 입력
		// ex) test.jpg / test.txt= 이미지 파일이 아님. / 
		//jpg, gif, png 이미지파일 이미지파일 판단 여부 후 출력

		Scanner sc= new Scanner(System.in);
		
		String[] names= {"jpg","gif","png"};

		String input= sc.next();
		input=input.toLowerCase();
		int index= input.lastIndexOf(".");
		String result= input.substring(index+1);
		System.out.println(result); 
		
		//확장자를 빼온 것.
		boolean check= false; // true면 이미지파일이다.
		//이제 비교하는 부분
		
		for(int i=0; i<names.length; i++) {
			if(result.equals(names[i])) {
				check=true;
				break;
			}
		}
		
		if(check== true) {
			System.out.println("이미지파일이다.");
		}else {
			System.out.println("이미지파일이 아니다.");
		}
		
		
		
		
		
		
//이건 내 코드 
		//int lastIndexOf= input.lastIndexOf("jpg");
//		int llof2= input.lastIndexOf("png");
//		int llof3= input.lastIndexOf("gif");
		
		
//		if(lastIndexOf >0 || llof2 >0 || llof3 >0) {
//			System.out.println("이미지 파일");
//		}else {
//			System.out.println("이미지파일ㄴㄴ");
//		}

		
//		if (contains=true) {
//			System.out.println("이미지파일입니다.");
//		}else {
//			System.out.println("이미지파일이 아닙니당");

	//	}
		
		
}

}

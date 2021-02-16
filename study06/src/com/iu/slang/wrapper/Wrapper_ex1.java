package com.iu.slang.wrapper;

import java.util.Scanner;

public class Wrapper_ex1 {
	//method 명은 jumincheck
	/*
	 * 입력받은 주민번호로 실제 있는 번호인지 없는번호인지판단이 가능 
	 * 주민번호를 입력받기 ex)123456-123456 7> 체크용 번호 
	 * 1 2 3 4 5 6 - 1 2 3 4 5 6 7
	 * 2 3 4 5 6 7   8 9 2 3 4 5 *
	 * 0 1 2 3 4 5   6 7 8 9 10 11 12
	 * 총합 // 11 의 나머지 = 1 
	 * 1. 맨 앞의 숫자에 *2;
	 * 2. 그 다음숫자는 *3 ; *4,, *5,, *6,, -는 pass /마지막 7은 체크형 번호라 노노
	 * 3. 총합 //11 의 나머지 구하기 
	 * 4. 11에서 나머지를 뺀다.
	 * if 결과가 10이상이면 다시 10으로 나누어서 나눈 나머지를 체크용 번호랑 비교
	 * 5. 체크용 번호와 같은지 비교한다. 같으면 올바른 주민번호, 아니면 옳지못한 주민번호 
	 * */

		private Scanner sc;
		

	public void jumincheck() {
		int[] number= new int[13]; //배열 생성하기 
		int[] ex1= {2,3,4,5,6,7,8,9,2,3,4,5};
		sc= new Scanner(System.in);
		System.out.println("주민번호 입력해주세요.");
		String num= sc.next(); // 주민번호 입력받기.
		int total = 0;

		num= num.replace("-",""); // -를 공백으로 바꿔주기

		//배열에 숫자로 바꾸어 문자 넣기
		for(int i=0; i<number.length; i++) {
			//문자열 하나를 배열에 넣어주면서,parseInt;
			String num2= num.substring(i,i+1);
			int num1= Integer.parseInt(num2);
			number[i]=num1;
		}

		for(int i=0; i<number.length-1; i++) {
			number[i]= number[i]*ex1[i];
		}
		
		//total값 구해주고 
		for(int i=0; i<number.length-1;i++) {
			total+=number[i];
		}


		//총합을 나눈다. other= 나머지
		int other= total%11;
		//나머지를 뺀 비교값
		int fact = 11-other;

		if (fact==number[12]) {
			System.out.println("올바른 주민번호");
		}else if(fact>=10) {
			fact=fact%10;
			if(fact==number[12]) {
				System.out.println("올바른 주민번호");
			}else {
				System.out.println("다시.");
			}
		}else {
			System.out.println("다시.");
		}
	}
	//ver2. getAge
	/* 주민번호 입력받기
	 * 123456-1234567
	 * 나이를출력
	 * 태어난 계절을 출력. 12/345봄/678여름/910가을11/겨울12
	 * 
	 * */

	public void getAge() {
		StringBuffer sb= new StringBuffer();
		sc= new Scanner(System.in);
		
		int now= 2021;
		System.out.println("주민번호 입력해주세요.");
		String num= sc.next(); // 주민번호 입력받기.

		num= num.replace("-",""); // -를 공백으로 바꿔주기
		//문자열 하나를 배열에 넣어주면서,parseInt;
		//앞자리
		String num3= num.substring(0,2);
		//뒷자리
		String num2= num.substring(6,7);
		int num1= Integer.parseInt(num2);
		if(num1==3 || num1==4) {
			String year20= sb.append(20)+num3;
			int year11= Integer.parseInt(year20); //연도 출력 
			int age= now-year11;
			System.out.println(age+1+"세 입니다.");

		}else if(num1==1 || num1==2) {
			String year19= sb.append(19)+num3;
			int year191= Integer.parseInt(year19); //1900년대 설정임.
			int age= now-year191;
			System.out.println(age+1+"세 입니다.");
			
		}
		
		
		//월  구분하기.
		
		String month= num.substring(4,5);
		int mon = Integer.parseInt(month);
		
		if(mon == 3|| mon==4||mon==5) {
			System.out.println("봄");
		}
		else if(mon == 6|| mon==7||mon==8) {
			System.out.println("여름");
		}
		else if(mon == 9|| mon==10||mon==11) {
			System.out.println("가을");
		}
		else if(mon == 1|| mon==2||mon==12) {
			System.out.println("겨울");
		}else {
			System.out.println("mon이 잘못됌");
		}




	}

}

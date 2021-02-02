package com.coconut.hey6;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		//성적관리프로그램 CRUD
		/*
		 * 1. 학생의 정보를 입력
		 *    -- 학생 수만큼 이름, 번호, 국어, 영어, 수학 점수를입력하세요
		 *    -- 총점과 평균(소수점 포함) 자동계산
		 * 2. 학생의 전체 정보를 출력
		 *     -- 전체 학생의 모든 정보를 출력
		 *     -- 학생의 이름, 번호, 국어, 영어,수학,총점, 평균 출력
		 * 3. 학생 정보를 검색하는 것
		 * 	  -- 검색할 번호를 입력, 번호는 중복 불가. 
		 * 	  --   학생의 이름, 번호, 국어, 영어,수학,총점, 평균 출력
		 *    -- 입력한 번호가 정보 없으면 정보없음으로 하기.
		 * 4. 최우수 학생을 출력 >> 평균이 제일 높은 사람.
		 * 
		 * 
		 * 5. 프로그램종료
		 * 
		 * 1,2,3 번의 활동이 끝나면 메뉴판이 다시 뜨기.
		 **/

		//학생의 수 입력하기
		Scanner sc= new Scanner(System.in);
		System.out.println("학생의 수를 입력하세요.");
		int stu= sc.nextInt();

		boolean check = true;
		int i=0;
		//배열 선언하기 이름
		String [] name= new String[stu];
		//번호
		int [] num= new int[name.length];
		//국어
		int [] kor= new int[name.length];
		//영어
		int [] eng= new int[name.length];
		//수학
		int [] math= new int[name.length];
		//총점
		int [] sum= new int[name.length];
		//평균
		double [] avg= new double[name.length];

		while(check) {

			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.학생 정보 입력");
			System.out.println("2.학생 전체 정보 출력");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 최우수 학생 출력 ");
			System.out.println("5. 프로그램 종료");

			//메뉴 번호 선택 입력하기. 
			int sel= sc.nextInt();

			if(sel==1) {  // 학생 정보 입력하기
				for(i=0;i<name.length;i++) {
					System.out.println("이름");
					name[i]=sc.next();
					System.out.println("번호");
					num[i]=sc.nextInt();
					System.out.println("국어점수");
					kor[i]=sc.nextInt();
					System.out.println("영어점수");
					eng[i]=sc.nextInt();
					System.out.println("수학점수");
					math[i]= sc.nextInt();
					sum[i]=kor[i]+eng[i]+math[i];
					avg[i]=sum[i]/3;
				}//for문 
			}//if문
			else if(sel==2) {
				//전체 학생의 모든 정보를 출력합니다.
				for(i=0;i<name.length;i++) {
					System.out.println("이름: "+name[i]+" 학번: "+num[i]+" 국어점수: "+kor[i]+" 영어점수: "+eng[i]+" 수학점수: "+math[i]+" 총점: "+sum[i]+" 평균: "+avg[i]);
				}//for문
			}//if문

			else if(sel==3) {
				System.out.println("검색할 학생의 번호를 입력해주세요.");
				int key=sc.nextInt();
				for(i=0;i<name.length;i++) {
					if(num[i]==key){
						System.out.println("이름: "+name[i]+" 학번: "+num[i]+" 국어점수: "+kor[i]+" 영어점수: "+eng[i]+" 수학점수: "+math[i]+" 총점: "+sum[i]+" 평균: "+avg[i]);
					}else {
						System.out.println("정보없음");
					}
					//else
				}//for
			}//if
			else if(sel==4) {
				double max=avg[0]; //최댓값 
				int idx=0;
				for(i=1; i<name.length;i++) {
					if(max<avg[i]) {
						max=avg[i];		
						idx= i;
					}
				}//for
				System.out.println("최우수학생은"+name[idx]+"평균"+max);
			}//elseif

			if(sel==5) {
				//프로그램 종료
				check=false;
			}
			

		}//while문의 끝

		System.out.println("------프로그램 종료------");

	}// main함수

}

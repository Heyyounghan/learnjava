/**
 * 스타트 메서드 생성, 1. 급여계산 
 * 급여를 입력받기.
 * 1.1 정규직 - cacul  
 * 1.2 계약직 - caclu2
 *   
 *   2. 프로그램 종료 
 */
package com.coconut.hey5;

import java.util.Scanner;

public class SalaryMenu {

	public void Start() {
		Scanner sc= new Scanner(System.in);

		boolean check= true;
		int select=0;

		Salary s= new Salary();


		while(check) {

			System.out.println("1. 급여계산");
			System.out.println("2. 프로그램 종료");
			select=sc.nextInt();

			switch(select) {
			case 1:

				System.out.println("급여를 입력하세요");
				int sal=sc.nextInt();

				System.out.println("1. 정규직");
				System.out.println("2. 계약직");
				int sel2=sc.nextInt();

				if(sel2==1) {
					s.calcul(sal);
				}else if(sel2==2) {
					s.cacul2(sal);
				}

				break;

			case 2:

				System.out.println("프로그램 종료");
				check=false;

				break;



			default:

				break;
			}



		}//while



	}

}

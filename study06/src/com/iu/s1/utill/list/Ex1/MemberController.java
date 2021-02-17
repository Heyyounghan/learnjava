package com.iu.s1.utill.list.Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {

	//start Method.
	// 
	public void start() {
		// 1. 회원정보 입력 2. 회원정보 출력 3.프로그램종료 
				MemberView mv= new MemberView();
				MemberInfo mi = new MemberInfo();
				ArrayList<MemberDTO> ar = new ArrayList<MemberDTO>();
				Scanner sc= new Scanner(System.in);
				boolean check=true;
				
				mi.init(ar);
				//init호출
				
				while(check){  
					
					System.out.println("1. 회원정보 입력");
					System.out.println("2. 회원정보 출력");
					System.out.println("3. 종료");
					
					int sel= sc.nextInt();
					
					
					switch(sel){

					case 1:
						mi.makeMember(ar);

						break;

					case 2:
								
						mv.view(ar);

						break;
					case 3:
						check=false;

						break;
						
					default:
						System.out.println("다시");
					}//switch
				}//while

	}
}

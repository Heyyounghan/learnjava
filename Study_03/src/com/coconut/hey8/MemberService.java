package com.coconut.hey8;

import java.util.Scanner;

public class MemberService {

	//회원가입.
	/*
	 * 메서드명 : memberJoin
	 * 가입할 회원 수 입력
	 * 회원 수 만큼 회원이 만들어짐. 
	 * 회원생성 -> 정보입력
	 * 회원들을 리턴하기.
	 * 
	 * */

	public Member[] memberJoin() {
		//가입할 회원 수 입력하기
		System.out.println("가입할 회원수를 입력하세요.");
		Scanner sc= new Scanner(System.in);

		int count=sc.nextInt();

		//회원수만큼 회원 생성 
		Member [] member= new Member[count];


		//정보 입력하기
		System.out.println("회원 정보를 입력");

		for(int i=0; i<member.length;i++) {
			Member mmr= new Member();
			System.out.println("id를 입력.");
			mmr.id=sc.nextInt();
			System.out.println("pw를 입력.");
			mmr.pw=sc.nextInt();
			System.out.println("이름을 입력");
			mmr.name= sc.next();
			member[i]= mmr;
		}
		return member;

	}


	//로그인 memberLogin
	// id랑 pw 입력받기
	//매개변수로 멤버들을 받아서 선언하기. 
	//일치하는지 안한지 검사하기. 검사결과를 리턴하기. 
	//

	public Member memberLogin(Member[] members) {
		Scanner sc= new Scanner(System.in);
		Member member=new Member(); //멤버 선언 
		//멤버를 받아서 선언하기.

		System.out.println("--로그인--");
		//int id=sc.nextInt(); //아이디 입력받기
		member.id= sc.nextInt();
		//int pw=sc.nextInt(); // pw 입력받기
		member.pw= sc.nextInt();

		Member result= null;

		for (int i=0; i<members.length;i++) {

			if(member.id==members[i].id && member.pw==members[i].pw) {
				result= members[i];
				break;

		}//if
	}
		return result;

}//class
	
}


package com.coconut.hey8;

public class Ex4Main {


	public static void main(String[] args) {
		// test 용도
		/*
		MemberService ms= new MemberService();
		
		Member[] member= ms.memberJoin();
		
		for(int i=0; i<member.length;i++) {
			System.out.println(member[i].id);
			System.out.println(member[i].pw);
			System.out.println(member[i].name);
		}
		
		//memberLogin 시도하기
		// if 로그인성공 = 이름 님 로그인 성공
		// if 로그인 실패= 로그인 실패출력하기.
		Member member1= ms.memberLogin(member);

		if(member1 != null) {
			System.out.println(member1.name+"님 로그인 성공 ");
		}else{
			System.out.println("로그인이 실패했습니다.");
		}*/
		
		
		//MemberController mc= new MemberController();
		
		//mc.Start();
		
		StudentController studentController= new StudentController();
		studentController.Start();

	}

}

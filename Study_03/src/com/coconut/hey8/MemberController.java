package com.coconut.hey8;

import java.util.Scanner;

public class MemberController {
	//메소드 이름은 start
	//실행시 memberJoin 실행하기.
	//1. 로그인
	//  - 메인메소드에서 
	//2. 종료
	
	Scanner sc;
	MemberService memberService;
	Member [] members;
	StudentController studentController;
	
	public MemberController() {
		sc= new Scanner(System.in);
		memberService= new MemberService();
		members = memberService.memberJoin();
		studentController = new StudentController();
		
		//데이터가 틀리거나, 따로 독립적인 애들을 사용하면 이 방법을 쓸 수 없지만 통상적으로
		// 멤버변수> 생성자를 사용하거나 멤버변수 초기화하는 방법을 선택하는것.
		
	}
	
	public void Start() {
		Scanner sc= new Scanner(System.in);
		MemberService ms= new MemberService(); //객체 생성하기
		StudentController studentController= new StudentController();
		Member[] members= ms.memberJoin();
		//선택하기.
		System.out.println("번호를 선택하세요");
		System.out.println("1.로그인");
		System.out.println("2.종료");
		
		int sel = sc.nextInt();

		
		switch(sel) {
		
		case 1:
			System.out.println("1.로그인");
			Member member1= ms.memberLogin(members);
			if(member1 != null) {
				System.out.println(member1.name+"로그인 성공");
				studentController.Start();
				
			}else {
				System.out.println("로그인 실패");
			}
			
		case 2:
			System.out.println("2.종료");
			break;
		}//switch
		

		
	}//Start method
	
}//class 

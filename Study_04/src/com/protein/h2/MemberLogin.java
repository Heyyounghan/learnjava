package com.protein.h2;

public class MemberLogin {
	
	public void login() {
		Member mm = new Member();
		MemberWork memberwork = new MemberWork();
		
		if(mm.getId()== 1234 && mm.getPw() == 5678) {
			MemberSession.member = mm;
			System.out.println("로그인했습니다.");
			memberwork.work();
		}else {
			System.out.println("다시 확인해주세요.");
		}
	}

}

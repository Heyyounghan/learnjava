package com.iu.s1.utill.list.Ex1;

import java.util.ArrayList;

public class MemberView {
	
	public void view(ArrayList<MemberDTO> ar) {
		//member DTO를 꺼내 정보를 출력
		
		for(int i=0; i<ar.size(); i++) {
			//Object를 다형성 개념 적용/ 오토언박싱해줘야함.
			MemberDTO m = ar.get(i);//DTO가 호출된다.
			System.out.println("id->"+m.getId());
			System.out.println("name ->"+m.getName());
			System.out.println("pw ->"+m.getPw());
			System.out.println("나이 ->"+m.getAge());
			System.out.println("포인트 -> "+ m.getPoint());
			
		}
	}

}

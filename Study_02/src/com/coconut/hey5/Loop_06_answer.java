package com.coconut.hey5;

import java.util.Scanner;

public class Loop_06_answer {

	public static void main(String[] args) {
		/** :선생님이 주신 정답코드.
		 * 2시간동안 코드 작성> 강사님께 파일 전송 (형식. 한혜영.java)
		 * RPG 게임
		 * Lv.1 ~ Lv. 15가 되면 끝난다.
		 * 모든 몬스터는 경험치가 동일
		 * 레벨이 올라갈수록 잡아야할 몬스터는 늘어난다. 
		 * 1-2 :3마리
		 * 2-3: 6마리
		 * 3-4: 9마리
		 * 4-5: 12마리
		 * * 3의 배수 패턴 
		 * 14-15: 42마리
		 * 
		 * 출력 : ex) lv 1-> lv2 : 몬스터 1마리 사냥.
		 * 						  몬스터 2마리 사냥.. 
		 * 						  몬스터 3마리 사냥... 
		 * 레벨업 출력
		 * 2->3 으로 갈때는 print 문 6번 
		 * 레벨업 보상으로 골드를 지급한다.lv.5가 되었을 때 1000gold를 지급한다.
		 * lv.10 = 2000 / lv.15= 30000 => 최종골드 출력하기.
		 * 레벨업을 찍고 다음 레벨 가기 전에 게임을 계속 할 것인지 유무를 물어보기.
		 * 종료할 때 현재 레벨과 골드를 출력하여 저장한다.
		 * 로그인- 
		 * */
		// 아이디와 패스워드
		int id=1234;
		int pw=5678;
		int select=0;
		Scanner sc= new Scanner(System.in);
		// 게임 ========================
		 int level=0;
		 int gold=0;
		
		
		boolean check= true;

		while(check) {
			System.out.println("RPG 게임에 오신 것을 환영합니다.");
			System.out.println("1.로그인");
			System.out.println("2.종료");

			select= sc.nextInt();

			if(select == 1) { // 로그인
				System.out.println("아이디 입력하기 ");
				// 아이디 입력
				int newId= sc.nextInt();

				System.out.println("비밀번호 입력");
				//비밀번호 입력
				int newPw= sc.nextInt();

				if (id==newId && pw==newPw) {

					System.out.println("로그인이 성공했습니다.");
					break;
				}else{
					System.out.println("아이디와 패스워드가 틀립니다.");
				}//else

			}//작은 if
			else {
				check=false;
			}// 큰 main if문

		}//while

		//게임 코드 시작.
		System.out.println("result:"+check);

		if(check) {
			System.out.println("게임을 진행합니다.");
			
			
			for(level=1;level<15;level++) {
				System.out.println("1.사냥 GOGO" );
				System.out.println("2. 게임 종료"); 
				
				select=sc.nextInt();
				
				if(select == 1) {
					
					for(int mon=0;mon<level*3;mon++) {
						System.out.println("몬스터 "+(mon+1)+"마리 사냥!");
					}
					System.out.println("사냥중");
					System.out.println("축! 레벨업"+(level+1));
					if((level+1)%5==0) {
						System.out.println((level+1)/5*1000+"Gold 지급하기");
						gold=gold+(level+1)/5*1000;
					}
				}else{
					System.out.println("게임을 종료합니다.");
					break;
				
				}
				

			}//for문 끝
			
			System.out.println("최종 레벨은 "+level);
			System.out.println("최종 골드는 "+gold);
		}





		System.out.println("게임이 종료되었습니다.");

	} //main
}

package com.coconut.hey5;

import java.util.Scanner;

public class Loop_06 {

	public static void main(String[] args) {
		/**
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
		Scanner sc= new Scanner(System.in);

		boolean check= true;

		while(check) {
			System.out.println("RPG 게임에 오신 것을 환영합니다.");
			System.out.println("1.로그인");
			System.out.println("2.종료");

			int select= sc.nextInt();

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

				}else if( id != newId || pw != newPw)
				{
					System.out.println("로그인이 실패했습니다.");
				}

				else if(select == 2){
					System.out.println("종료합니다.");
					break; // 처음으로돌아감
				}//else-if
			}//if
		}//while

		//게임 코드 시작.


		//변수 선언 및 초기화
		int level=1; // 레벨
		int monster=0; // 몬스터
		//int exp=0; // 경험치 
		//int totalexp=0; // 경험치 누적 변수 
		int gold=0; // 보상 골드
		int total=0; // 골드 누적변수

		//몬스터 사냥 버튼 누르기.
		//char swit= sc.next().charAt(0);

		System.out.println("접속을 환영합니다. 만렙을 찍으세요.");
		System.out.println("몬스터를 사냥합니다.");
		System.out.println("현재 당신의 레벨은 "+level+" 입니다.");
		
		boolean select=true;
		int totalmon=0; //몬스터 누적 변수 선언. 


		//몬스터 사냥 및 레벨1 
		while(select) { // 레벨이 15가 되면 while이 멈춥니다.
			
			for(monster=0;monster<42;monster++) {
				//0마리부터 시작하는 몬스터잡기.
				//3의 배수..  이중포문  level*3 자동초기화
				totalmon=monster;
				System.out.println("몬스터"+totalmon+"마리 사냥!");
			if(totalmon%3==0) {
				System.out.println("Level up! 축하합니다.");
				level=level+1;
				System.out.println("당신의 레벨은 "+level+" 입니다.");
				continue;
			}
			}//for문
				
				if(level%5==0) {
					System.out.println("축하합니다 보상이들어왔습니다.");
					gold=gold+1000;
					System.out.println(gold+"를 지급해드립니다.");
					total=gold;
					System.out.println("게임을 계속 하시겠습니까?");
					System.out.println("1.예");
					System.out.println("2.아니오");
					int num=sc.nextInt();

					if(num==1) {
						System.out.println("게임을 계속합니다.");
					}else if(num==2) {
						System.out.println("게임을 종료합니다.");
						System.out.println("당신이 가진 골드는 "+total+"골드와 현재 레벨은 "+level+"입니다.");
						break;

				}//else-if -gold
			}//if문 gold
				
			if(level==15) {
				System.out.println("목표 레벨을 달성했습니다.");
				System.out.println("게임이 종료됩니다.");
				System.out.println("당신이 가진 골드는 "+total+"골드와 현재 레벨은 "+level+"입니다.");
				select=false;} //레벨 15가 되면 while이 종료한다.

		}//while
	
		System.out.println("게임이 종료되었습니다.");

	} //main
}

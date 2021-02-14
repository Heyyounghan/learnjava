package com.cookie.n1;

import java.util.Scanner;

public class Running extends Field{


	public void runrun() {
		Cookie cc = new Cookie();

		boolean check= true;
		int sel=0;
		int totalhp=cc.getHp();

		while(check) {
			
			Scanner sc= new Scanner(System.in);
			

			distance--;
			System.out.println("==============================");
			System.out.println("남은 거리는"+distance+"m입니다.");
			totaldistance++;
			System.out.println("현재 거리는"+totaldistance+"m 입니다.");
			System.out.println("===============================");



			if(distance%2==0) {
				System.out.println("=================");
				System.out.println("일반젤리 등장!");
				System.out.println("4번: 젤리 냠냠 / 5번: 젤리 피하기");
				sel=sc.nextInt();
				switch(sel) {

				case 4: 
					System.out.println("젤리 냠냠");
					totalhp-=1;
					cc.runs();
					cc.total++;
					totalhp-=1;
					System.out.println("hp:"+totalhp+"점수:"+cc.total);


					break;

				case 5:
					System.out.println("젤리피했당");
					cc.underfloor();
					totalhp-=1;
					System.out.println("hp:"+totalhp+"점수:"+cc.total);

					break;
				}
			}
			else if(distance%3 == 0) {
				System.out.println("=================");
				System.out.println("곰젤리 등장");
				System.out.println("8번: 젤리 점프냠!/ 5번: 젤리 피하기");
				sel=sc.nextInt();
				switch(sel) {

				case 8: 
					System.out.println("젤리 냠냠");
					totalhp-=1;
					cc.total+=100;
					cc.jump();
					totalhp-=1;
					System.out.println("hp:"+totalhp+"점수:"+cc.total);


					break;

				case 5:
					System.out.println("젤리피했당");
					cc.underfloor();
					totalhp-=1;
					System.out.println("hp:"+totalhp+"점수:"+cc.total);


					break;
				}
			}
			else if(distance%19==0) {
				System.out.println("=================");
				System.out.println("hp 회복물약 등장");
				System.out.println("더블점프로 먹어요. 9번");
				sel=sc.nextInt();
				switch(sel) {

				case 9: 
					cc.doublejump();
					totalhp-=1;
					System.out.println("hp물약 습득");
					totalhp +=plushp;
					System.out.println("hp:"+totalhp+"점수:"+cc.total);
					break;
				}

			}
			if(totalhp==0) {
				check=false;
			}
			if(distance == 0) {
				check=false;
			}
			



		}//while문 끝 
		System.out.println("게임 종료");

	}



}



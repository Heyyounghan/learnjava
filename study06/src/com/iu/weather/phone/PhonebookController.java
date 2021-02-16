package com.iu.weather.phone;

import java.util.Scanner;

public class PhonebookController {
	
	private Scanner sc;
	private PhonebookInfo phoneInfo;
	private PhonebookView phoneView;
	
	public PhonebookController() {
		sc= new Scanner(System.in);
		phoneInfo= new PhonebookInfo();
		phoneView= new PhonebookView();
	}
	
	public void start() {
		//1.초기화 2. 출력 3. 종료
		
		
		boolean check= true;
		PhonebookDTO[] phoneDTO=null;
		
		while(check) {
			System.out.println("1.전화번호부 초기화");
			System.out.println("2.전화번호부 출력");
			System.out.println("3.종료");
			
			int sel= sc.nextInt();
			
			switch(sel) {
			
			case 1:
				System.out.println("날씨를 초기화합니다.");
				phoneDTO=phoneInfo.makePhonebook();
				
				break;
				
			case 2:
				System.out.println("출력!");
				if(phoneDTO != null) {
					phoneView.view(phoneDTO);
				}else {
					System.out.println("초기화하세요.");
				}
				
				break;
				
			case 3:
				System.out.println("프로그램을 종료합니다.");
				check=false;
				break;
				
			default:
				System.out.println("다시 입력하세요.");
				
			}//switch
		}//while
		
		
		
	}

}

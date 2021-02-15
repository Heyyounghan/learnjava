package com.iu.weather;

import java.util.Scanner;

public class WeatherController {

	private Scanner sc;
	private WeatherInfo wdinfo;
	private WeatherView wdview;

	public WeatherController() {
		sc= new Scanner(System.in);
		wdinfo= new WeatherInfo();
		wdview= new WeatherView();

	}

	public void start() {
		//1. 날씨 초기화 , 2. 날씨정보 출력 , 3. 프로그램 종료


		boolean check= true;
		WeatherDTO[] wedDtos=null;

		while(check) {
			System.out.println("1.날씨 초기화");
			System.out.println("2.날씨 정보 출력");
			System.out.println("3.날씨 정보 검색");
			System.out.println("4.프로그램 종료");
			int sel=sc.nextInt();

			switch(sel) {

			case 1: //날씨 초기화
				System.out.println("날씨를 초기화 합니다.");
				wedDtos=wdinfo.makeWeather();

				break;

			case 2:
				if(wedDtos != null) {
					System.out.println("날씨 정보를 출력합니다.");
					wdview.view(wedDtos);}else {
						System.out.println("초기화를 먼저 진행하세요.");
					}

				break;

			case 3:
				System.out.println("도시명을 입력하세요.");
				WeatherDTO wddto= wdinfo.searchWeather(wedDtos);
				if(wddto != null) {
					wdview.view(wedDtos);
				}else {
					wdview.view("찾는 정보가 없습니다.");
				}
				
				break;
				
			case 4:
				System.out.println("프로그램을 종료합니다.");
				check=false;

				break;
			default:
				System.out.println("번호를 다시 누르세요.");
			}//switch

		}//while 

	}



}

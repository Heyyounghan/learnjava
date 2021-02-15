package com.iu.weather;

import java.util.Arrays;
import java.util.Scanner;

public class WeatherInfo {

	private String info;

	public WeatherInfo() {
		//날씨정보 : 도시명, 기오느 습도 상태
		this.info= "서울 22 60% 흐림";
		this.info= this.info+ " 대전 -32 10% 맑음";
		this.info= this.info+ " 제주 14 90% 비";
		this.info= this.info+ " 부산 0 70% 눈";


	}

	//메서드명 makeWeather
	//info를 파싱해서 weatherDTO를 생성하고
	//weatherDTO 리턴 

	public WeatherDTO[] makeWeather() {

		String[] ar= this.info.split(" ");
		WeatherDTO[] wedto= new WeatherDTO[ar.length/4];
		int index=0;

		for(int i=0; i<ar.length; i++) {
			WeatherDTO wdto= new WeatherDTO();
			wdto.setCity(ar[i]);
			wdto.setAircondition(ar[++i]);
			wdto.setHumidity(ar[++i]);
			wdto.setStatus(ar[++i]);
			wedto[index]=wdto;
			index++;
		}
		//for(int i=0; i<wedto.length; i++) {
		//	System.out.println(wedto[i].getCity());
		//	System.out.println(wedto[i].getAircondition());
		//}
		return wedto;
	}

	public WeatherDTO searchWeather(WeatherDTO[] ar) {
		//날씨정보들을 매개변수로 받기.
		//검색하고자하는 도시명을 입력받는다.
		//검색된 DTO를 리턴
		Scanner sc= new Scanner(System.in);

		System.out.println("도시를 검색하세요.");
		String search= sc.next();

		WeatherDTO wdDTO=null;


		for(int i=0; i<ar.length;i++) {
			if(search.equals(ar[i].getCity())) {
				wdDTO= ar[i];
				break;
			}
		}



		return wdDTO;
	}
}


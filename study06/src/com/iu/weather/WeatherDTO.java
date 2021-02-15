package com.iu.weather;

public class WeatherDTO {
	//DTO = data transfer Object 날씨정보를 가진 클래스
	//도시명
	private String city;
	//기온
	private String aircondition;
	//습도
	private String humidity;
	//상태
	private String status;
	
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAircondition() {
		return aircondition;
	}
	public void setAircondition(String aircondition) {
		this.aircondition = aircondition;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
		
	
	
	
	

}

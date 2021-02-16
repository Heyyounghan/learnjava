package com.iu.weather.phone;

public class PhonebookInfo {
	
	private String data;
	
	public PhonebookInfo() {
		//이름, 전화번호 나이 메모
		//version1 
		this.data="혜니-01012341234-26-sing";
		this.data=this.data+"예니-01045674567-25-marketing";
		this.data+="지니-01011112222-24-student";
		//version2= 
	}
	
	//먼저 전화번호부를 만든다. info를 파싱해서 폰북DTO생성 및 리턴
	
	
	public PhonebookDTO[] makePhonebook() {
		
		String data= this.data.replace("-"," ");
		String[] arr= data.split(" ");
		PhonebookDTO[] pbDTO= new PhonebookDTO[arr.length/4];
		int index=0;
		for(int i=0; i<arr.length; i++) {
			PhonebookDTO pbDTO1 = new PhonebookDTO();
			pbDTO1.setName(arr[i]); //0
			pbDTO1.setNumber(arr[++i]);//1
			pbDTO1.setAge(arr[++i]);//2
			pbDTO1.setJob(arr[++i]);//3 값 넣어주고 
			
			pbDTO[index]=pbDTO1; //위에서선언한거에 여기서 선언한 거에 넣어주는거.
			index++; 
			
		}
		return pbDTO ;// 생성된 DTO 리턴  
			
		
	}

}

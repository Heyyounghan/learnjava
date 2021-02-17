package com.iu.s1.utill.list.Ex1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;


public class MemberInfo {
	
	//makeMember 
	//member의 정보를 입력해서 만듬
	private Scanner sc;
	private StringBuffer sb;
	
	public MemberInfo() {
		sc=new Scanner(System.in);
		sb=new StringBuffer();
		sb.append("id1,pw1,name1,32,4.1,");
		sb.append("id2, pw2, name2, 44, 2.1,");
		sb.append("id2-pw3-name+28+4.21");
		
		
	}
	
	public ArrayList init(ArrayList<MemberDTO> ar) { //파싱하기 
		//split
		String str = sb.toString();
		//ArrayList ar= new ArrayList<>();
		
		
		
		str= str.replace("-",",");
		str= str.replace("+",",");
		str= str.replace("","");
		
		String[] arr= str.split(",");
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			MemberDTO mDTO = new MemberDTO();
			mDTO.setId(arr[i]);
			mDTO.setPw(arr[++i]);
			mDTO.setName(arr[++i]);
			mDTO.setAge(Integer.parseInt(arr[++i].trim()));
			mDTO.setPoint(Double.parseDouble(arr[++i].trim()));
			ar.add(mDTO);
		}
		
				
		
		return ar;

		
		
	}
	
	public void makeMember(ArrayList<MemberDTO> ar) {
		//입력
		Scanner sc= new Scanner(System.in);

		MemberDTO mDTO = new MemberDTO(); // 선언
		
		
		System.out.println("Id 입력");
		mDTO.setId(sc.next());
		System.out.println("이름 입력");
		mDTO.setName(sc.next());
		System.out.println("PW입력");
		mDTO.setPw(sc.next());	 
		System.out.println("나이 입력");
		mDTO.setAge(sc.nextInt());
		System.out.println("점수 입력");
		mDTO.setPoint(sc.nextDouble());
		
		ar.add(mDTO);

	}
	

}

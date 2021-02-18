package com.iu.s1.utill.token.ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Bankbook {
	
	private StringBuffer sb;
	
	public Bankbook() {
		sb= new StringBuffer();
		sb.append("kb,국민,마이핏적금,1.2,500,");
		sb.append("woo,우리,직장인우대적금,1.5,3000,");
		sb.append("woo,우리,나라사랑적금,3.4,1000,");
		sb.append("kb,국민,자유적금,0.8,2000");
			
	}
	
	public HashMap<String,ArrayList<BankDTO>> init3() { //은행이 두개인데 결과물은 kb키로 꺼내면 마이핏적금 두개가 나와야함.
		String str= sb.toString();
		
		StringTokenizer st= new StringTokenizer(str,",");
		ArrayList<BankDTO> kb= new ArrayList<>();
		ArrayList<BankDTO> woo= new ArrayList<>();

		HashMap<String, ArrayList<BankDTO>> map = new HashMap<>();
		
		
		while(st.hasMoreTokens()) {
			BankDTO bDTO= new BankDTO();
			String key= st.nextToken();
			bDTO.setBank(st.nextToken());
			bDTO.setProduct(st.nextToken());
			bDTO.setTax(Double.parseDouble(st.nextToken()));
			bDTO.setCash(Integer.parseInt(st.nextToken()));
			
			if(key.equals(kb)) {
				kb.add(bDTO);
				map.put(key, kb);
			}else {
				woo.add(bDTO);
				map.put(key, woo);
			}
		}
		
		
		return map;		
	}

	
	//init2 == hashmap Return 
	// StringTokenizer 로 파싱  , KeyValue 형식의 map으로 만들어보기.
	
	public HashMap<String, BankDTO> init2() {	
		
		String str= sb.toString();
		
		StringTokenizer st = new StringTokenizer(str,",");
		HashMap<String, BankDTO> hm = new HashMap<>();
		
		while(st.hasMoreTokens()) {
			BankDTO bDTO= new BankDTO();
			String key= st.nextToken();
			//bDTO.setBank(st.nextToken());
			bDTO.setProduct(st.nextToken());
			bDTO.setTax(Double.parseDouble(st.nextToken()));
			bDTO.setCash(Integer.parseInt(st.nextToken()));
			
			hm.put(key, bDTO);

		}
	
		
		return hm;
	}
	
	
	// init 메서드 생성 -> 파싱
	//파싱은 StringTokenizer
	public List<BankDTO> init() {
		
		String str= sb.toString();

		StringTokenizer st = new StringTokenizer(str,",");
		ArrayList<BankDTO> arr= new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			
			//DTOㄹ를 불러와줘야함.
			BankDTO bDTO= new BankDTO();

			//st.nextToken, sttokenizer.nextToken을 해야한다. str을 수식하는게 아님.
			bDTO.setBank(st.nextToken());
			bDTO.setProduct(st.nextToken());
			bDTO.setTax(Double.parseDouble(st.nextToken()));
			bDTO.setCash(Integer.parseInt(st.nextToken()));
			arr.add(bDTO);
		}
		
		
		
		return arr;
				
			
	}

}

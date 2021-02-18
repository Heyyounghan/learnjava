package com.iu.s1.utill.map;

import java.util.HashMap;

public class HashMap_1 {

	public static void main(String[] args) {
		
		//key = String type Value= Generic 
		HashMap<String, Integer> map = new HashMap<>();
		
		//요소 넣기 : put
		map.put("halo", 10);
		map.put("Beyonce",20);
		
		
		System.out.println(map);
		
		//1개씩 꺼내는건 get method
		
		int num= map.get("halo");
		
		System.out.println(num);
		//key는 중복이 되면 안됀다. 파이썬의 딕셔너리랑 비슷.... 
		
		map.remove("halo");
		
		System.out.println(map);
		System.out.println(map.size());
		
		map.clear();
		
		System.out.println(map);
		
		
	}

}

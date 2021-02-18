package com.iu.s1.utill.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm= new HashMap<>();
		
		hm.put("n1", 10);
		hm.put("n2", 12);
		hm.put("n3", 15);
		hm.put("n4", 30);
		
		// key를 알아야 value를 알 수 있다.
		// keySet...  순서 유지 X 중복을 허용하지 않음,
		Set<String> set = hm.keySet();
		
		Iterator<String> iterator = set.iterator(); // map에 있는 키를 set으로 바꾸고 set을꺼내려면 iterator로 변경 
		
		while(iterator.hasNext()) {
			String key= iterator.next();
			System.out.println(key);
			Integer value= hm.get(key);
			System.out.println(value);
		}
		

	}

}

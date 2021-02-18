package com.iu.utill.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_1 {

	public static void main(String[] args) {
		HashSet<Integer> hashSet= new HashSet<>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(1);
		hashSet.add(3);
		boolean result= hashSet.add(3);
		ArrayList<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(2);
		array.add(1);
		
		System.out.println(hashSet.size());
		
		System.out.println(hashSet.toString());
		System.out.println(array.toString());
		
		hashSet.remove(2);
		

		
		//열거형, 반복자... iterator = 하나의 collection framework
		Iterator<Integer> iterator= hashSet.iterator();
		
		
		while(iterator.hasNext()) { // 다음요소가 있으면 t 없으면 f 
			int i=iterator.next();
			System.out.println(i);
		}
	}

}

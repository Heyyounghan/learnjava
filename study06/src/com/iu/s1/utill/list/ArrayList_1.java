package com.iu.s1.utill.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_1 {

	public static void main(String[] args) {
		//모으려고하는 데이터타입 -> 제네릭 
		ArrayList<Object> ar= new ArrayList<>();
		
		ar.add("first");
		ar.add(2);
		ar.add("4");
		ar.add(0,"aff"); //새로운 인덱스 번호에 데이터를 삽입

		ar.set(2,"set" );
		
		for (int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar2= new ArrayList<>();
		//integer 타입만 보장한다.
		
		ar2.add(10);
		

	}

}

package com.iu.s1.utill.ex1;

import java.util.ArrayList;

public class Ex1_Main {

	public static void main(String[] args) {
		
		Test t1= new Test();
		
		ArrayList<Integer> ar = t1.makeList();
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}

	}

}

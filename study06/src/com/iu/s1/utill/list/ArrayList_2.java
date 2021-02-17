package com.iu.s1.utill.list;

import java.util.ArrayList;

public class ArrayList_2 {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		
		ar.add(1);
		ar.add(2);
		ar.add(3);
		
		ArrayList<Integer> ar2= new ArrayList<>();
		
		ar2.add(4);
		ar2.add(5);
		ar2.add(6);
		
		ArrayList<Object> lar= new ArrayList<>();
		//ArrayList<ArrayList<Integer>> arss = new ArrayList<>();
		lar.add(ar);
		lar.add(ar2);
		
		System.out.println(lar);
		/*
		 *for(int i=0; i<arss.size(); i++){
		 *ArrayList<Integer> a= ars.get(i);
		 *for(int j=0; j<arss.get(i).size(); j++){
		 *sysout(arss.get(i).get(j)); 
		 * */

	}

}

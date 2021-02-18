package com.iu.s1.utill.token.ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex1Main {

	public static void main(String[] args) {
		
		Bankbook bb = new Bankbook();
		HashMap<String, ArrayList<BankDTO>> map =bb.init3();
		
		Set<String> set= map.keySet();
		Iterator<String> it= set.iterator();
		
		while(it.hasNext()) {
			String key= it.next();
			ArrayList<BankDTO> ar =map.get(key);
			System.out.println("=============================================");
			for(int i=0; i<ar.size(); i++) {
				System.out.println(ar.get(i).getBank());
				System.out.print(ar.get(i).getProduct());
				System.out.print(ar.get(i).getTax()+"===");
				System.out.println(ar.get(i).getCash());
				
		}
			
		
//		HashMap<String, BankDTO> map= bb.init3();
//		
//		Set<String> set= map.keySet();
//		
//		Iterator<String> iterator = set.iterator();
//		
//		while(iterator.hasNext()) {
//			String key= iterator.next();
//			BankDTO bdto= map.get(key);
//			System.out.print(bdto.getBank());
//			System.out.print(bdto.getProduct());
//			System.out.print(bdto.getTax()+"===");
//			System.out.println(bdto.getCash());
//			System.out.println("==============");
//		
		}
		
		

//		List<BankDTO> ar= bb.init();
//		
//		for (int i=0; i<ar.size(); i++) {
//			System.out.print(ar.get(i).getBank());
//			System.out.print(ar.get(i).getProduct());
//			System.out.print(ar.get(i).getTax()+"===");
//			System.out.println(ar.get(i).getCash());
//		}
//		

		


	}

}

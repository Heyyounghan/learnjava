package com.iu.slang.ex;

public class ExMain {

	public static void main(String[] args) {
		
		Test1 t1= new Test1();
		Test2 t2= new Test2();
		
		//t1과 t2를 담을 수 있는 배열을 선언.
		//같은 데이터타입을 담을 수 있고, 선언을 할 수 있
		//상속과 다형성 
		Object[] obj= new Object[3];
		
		obj[0]= t1;
		obj[1]= t2;
//		System.out.println(((Test1)obj[0]).name);
//		System.out.println(((Test2)obj[1]).age);
//---------------------------------------------------
		obj = new Object[0];
		//System.out.println(obj.length); //obj의 길이값 
		
		ObjectArray oba = new ObjectArray();
		System.out.println(oba.ar.length);
		
		oba.add(t1);
		
		System.out.println(oba.ar.length);
		oba.add(t2);
		
		System.out.println(oba.ar.length);
//---------------------------------------------	
		
	//	oba.pop();
	//	System.out.println(oba.ar.length);
		
	//	oba.shift();
	//	System.out.println(oba.ar.length);
		
	//	oba.removeall();
	//	System.out.println(oba.ar.length);
		
		oba.size();
		System.out.println(oba.ar.length);
		
				

	}

}

package com.iu.slang.ex;

public class ExMain2 {

	public static void main(String[] args) {
		ObjectArray obja= new ObjectArray();
		
		//Object -> reference
		// i-> primitive
		//"iy"->reference
		int num=10;
		
		obja.add(num);
		obja.add(2.12); // object 타입만 들어가야하지만 오토박싱됌.
		Object o= obja.get(0);
		System.out.println(o);
		//위에는 다 오토박싱되어 들어갔으나 이건 역으로 오토언박싱
//		int num2= (int)obja.get(0);
		
	//	System.out.println(num2);
		//auto unboxing
//		Double num4=(Double)obja.get(1);
		double num3= (Double)obja.get(1);
		System.out.println(num3);
		
		Test1 t1= new Test1();
		Test2 t2= new Test2();
		
		Object obj1= t1; // 다형성때문에 부모영역의 알고있는거까지 갈 수 있다.
		Object obj2= t2;
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		
		

	}

}

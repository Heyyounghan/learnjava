package com.protein.h2;

public class StaticTest {
	
	public static int num=10; // 클래스변수, static 영역에 존재 
	
	public String name="is"; // 인스턴스변수, heap에 만들어질 영역
	
	//Class Method -Static 
	public static void staticInfo() {
		double point = 1.1; // 지역변수 
		System.out.println("System Method");
		
	}
	
	//Instance Method - Heap영역에 생성 
	public void instanceInfo() {
		System.out.println("Instance Method");
		System.out.println(this.name);
		System.out.println(StaticTest.num);

	}

}

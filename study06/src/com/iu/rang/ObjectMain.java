package com.iu.rang;

public class ObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스명 + 참소 변수명 = new 스톱명()
		
		Object obj = new Object();
		Object obj2= new Object();
		
		
		//메서드 선언 공식 
		//접근지정자 [ 그외지정자 ] 리턴 타입 메서드 이름(매개변수 선언하기 ) 
		
		boolean check= obj.equals(obj);
		System.out.println(check);
		
		
		String string = obj.toString(); 
		// 메모리의 주소를 문자열로 반환해주는 것이다
		
		System.out.println(string);
		System.out.println(obj); //obj.toSTring이랑 결과값이 동일하다.
		
		

		
	}

}

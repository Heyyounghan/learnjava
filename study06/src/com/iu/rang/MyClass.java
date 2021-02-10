package com.iu.rang;

public class MyClass { //extends Object 생략이되어있다.
	
	int num;
	String name;
	
	//equals 오버라이딩 
	
	@Override
		public boolean equals(Object obj) { //오버라이딩은 선언부는그대로 내용만 교체 
			boolean check= false;
			MyClass my= (MyClass)obj;
			
			if(this.num == my.num && this.name.equals(my.name)) {
				
				check= true;
				
			}
			/*
			 * num은 primitive type = 정수형과 같은 타입은 == 연산자로 비교가 가능하지만
			 * name은 참조변수, 주소값이 같게 하기 위해서 equals라는 함수를 써야한다.
			 * */
			
			return check;
		}
	

}

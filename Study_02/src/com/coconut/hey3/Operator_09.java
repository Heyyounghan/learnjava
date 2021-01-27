package com.coconut.hey3;

public class Operator_09 {

	public static void main(String[] args) {
		
		int count= 1;
		System.out.println(count);
		
		count = count+1;
		
		System.out.println(count);
		//증감 연산자는 자기 자신을 1 증가시키거나 1 감소시키는 것이다.
		
		int num=1;
		
		System.out.println(num);
	
		++num;
		System.out.println(num);
		
		--num;
		System.out.println(num);
		
		num++;
		System.out.println(num);
		
		count= ++num;
		//num=num+1;
		//count=num; 선행 연산자
		
		System.out.println("========================");
		System.out.println("count:"+count);
		System.out.println("num:"+num);
		
		num=1;
		count= 1;
		count= num++;
		//count= num;
		//num=num+1; 후행 연산자. 
		
		System.out.println("절취선====================");
		System.out.println("count:"+count);
		System.out.println("num:"+num);
		
		num=1;
		count=1;
		count= 1+num++;
		System.out.println("count:"+count); //1
		System.out.println("num:"+num);//2


	}

}

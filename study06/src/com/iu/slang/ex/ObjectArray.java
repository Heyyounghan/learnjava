package com.iu.slang.ex;

public class ObjectArray {


	Object[] ar;

	//생성자 기본 
	public  ObjectArray() {
		ar= new Object[0];
	}



	public int add(Object obj) {//배열을 늘리는거.
		
		Object[] arr= new Object[ar.length+1];
		
		for(int i=0; i<ar.length; i++) {
			//arr[i]=obj;
			arr[i]=ar[i];
		}
		
		arr[ar.length]=obj;
		ar=arr;
		//this.ar = arr;
		
		return ar.length;

		
	}
	//받은 obj 배열을 ar에 추가 ar을 한칸 늘려야함.

//1. pop , 배열의 길이를 리턴, 배열의 0번 index를 지우는거.
//2. shift, 배열의 길이 리턴, 배열의 마지막 인덱스를 지우는거. 
//3. remove all  배열의 모든 인덱스를 지움. 

	public int pop() {
		Object[] arr= new Object[ar.length-1];
		//한개보다 작게 생성하고 
		
		
		for(int i=1; i<arr.length; i++) {
			arr[i-1]=ar[i]; 
		} // 0번이 아닌 1번부터 넣어줌! 그니까 0번은 걍 사라짐 바이바이 
		
		//arr[ar.length]=obj;
		this.ar=arr; //덮어씌워주기! 

		return ar.length; //길이는 하나 줄었지롱. 
	}
	
	public int shift() {
		Object[] arr= new Object[ar.length-1]; // 한개 적게 선언 
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=ar[i];
		} // 마지막거니까 한개 적은거에 순서대로 넣어줌 
		
		
		this.ar=arr; // 덮어씌우기 
		
		
		return ar.length; // 하나는 줄었음. 
	}
	
	//remove() 배열의 길이 리턴 매개변수로 지우려는 인덱번호 
	
	public int remove(int j) {
		
		Object[] arr = new Object[ar.length-1];
		
		int idx=0; //arr 인덱스 번호
		
		for(int i=0; i<ar.length; i++) {
			if(idx==i) {
				continue;				
			}
			arr[idx]=ar[i];
			idx++;
		}
		
		this.ar= arr;	
		
		
		return ar.length;
		
	}
	

	public void removeall() {
		Object[] arr= new Object[0]; //배열 0개를 선언 
		
		
		this.ar=arr; //아무것도 없이 다 지워져버림. 
		
	}
	
	//4. size > size 출력. 배열의 길이를 리턴
	
	public int size() {
		
		return ar.length; // 그냥 길이값 리턴.
	}
	
	public  Object get(int i) {
		//매개변수= 인덱스 번호. 배열에서 해당 인덱스 요소를 리턴 
		return ar[i];
	}

	


}
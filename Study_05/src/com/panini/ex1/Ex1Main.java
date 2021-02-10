package com.panini.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		Computer com = new Computer();
		Phone phone = new Phone();
		Tv tv=new Tv();
		
		//com.info();
		//phone.info();
		//tv.info();
		
		//DigitalDevice dd = phone;
		//System.out.println(dd.getCompany());
		//System.out.println(dd.getBrand());
		//System.out.println(dd.getPrice());
		//System.out.println(dd.getPoint());
		
		//phone = (Phone)dd;
		//System.out.println(phone.getCompany());
		//System.out.println(phone.getBrand());
		//System.out.println(phone.getPoint());
		//System.out.println(phone.getPrice());
		//System.out.println(phone.getNetwork());
		//역으로 바꿀때는형변환을 시켜줘야함
		
		//프로덕트 타입 
		
		//배열
		//예시 ) 배열 = 장바구니.
		
		//Computer[] computer= new Computer[3];
		
		//부모형태 사용
		
		//DigitalDevice [] ar = new DigitalDevice[3];
		//ar[0]=com;
		////ar[1]=phone;
		//ar[2]=tv;
		
		
		Customer cs = new Customer();
		
		cs.setMoney(5000);
		cs.setPoint(20);
		
		cs.buy(com);
		cs.buy(tv);
		cs.buy(phone);

		
		
		
		

	}

}

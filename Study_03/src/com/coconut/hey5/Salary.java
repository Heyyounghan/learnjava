package com.coconut.hey5;

public class Salary {
	//메서드 명은 getsal2, 정규직이 아니라 계약직의 경우 
	//받은 급여에 사대보험은 안떼고 원천징수 3.3프로만

	public void calcul(int sal) {
		

		// 받은 급여에 세금을 제하고 실급여를 출력하는 것 
		// 국민연금 1.2%, 의료보험 2%, 실업급여 0.5%, 산재 0.3%
		double totaltax= (sal*0.012)+ (sal*0.02)+ (sal*0.005)+(sal*0.003);
		
		double result= sal-totaltax;
		
		System.out.println("실수령액은:"+result);
	}
	
	public void cacul2(int sal) {
		//계약직
		
		double totaltax= (sal*0.033);
		double result= sal-totaltax;
		
		System.out.println("실수령액은"+result);
		
	}
	

}

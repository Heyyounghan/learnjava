package comc.coconut.hey4;

import java.util.Scanner;

public class S2Main2 {

	public static void main(String[] args) {
		
		MethodTest2 mt2= new MethodTest2();
		Scanner sc= new Scanner(System.in);
		System.out.println("1번 숫자 입력");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		mt2.sum(num1, num2); // 인자값 

	}

}

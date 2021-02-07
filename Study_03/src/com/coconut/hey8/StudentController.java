package com.coconut.hey8;

import java.util.Scanner;

public class StudentController {
	
	//Start 메서드 생성.
	
	//실행되면 1. 학생정보입력 2. 학생정보출력 3.검색,추가 삭제 추가하기..  4.종료

	public void Start() {
		Scanner sc= new Scanner(System.in);
		StudentService ss= new StudentService();
		Student [] stu= ss.StudentInput();
		
		
		System.out.println("----시작하기---");
		System.out.println("1. 학생정보 입력하기");
		System.out.println("2. 학생정보 출력하기");
		System.out.println("3. 학생정보 검색하기");
		System.out.println("4. 학생정보 삭제하기");
		System.out.println("5. 학생정보 추가하기");
		System.out.println("6. 종료");
		
		
		System.out.println("번호를 입력하세요.");
		int sel= sc.nextInt();
		
		boolean check= true;
		
		while(check) {
			
		switch(sel) {
		
		case 1:
			System.out.println("1. 학생정보 입력하기");
			ss.StudentInput();
			
			break;
			
		case 2:
			System.out.println("2. 학생정보 출력하기");
			ss.StudentView(stu);

			break;
		case 3:
			System.out.println("3. 학생정보 검색하기");
			ss.StudentSearch(stu);

			break;
			
		case 4:
			System.out.println("4. 학생정보 추가하기");
			ss.StudentAdd(stu);
			
			break;
			
		case 5: 
			System.out.println("5. 학생정보 삭제하기");
			ss.StudentDelete(stu);
			
			break;			
		case 6:
			System.out.println("6. 프로그램 종료하기");
			
			check=false;
			break;
		}
		}
		
	}
}

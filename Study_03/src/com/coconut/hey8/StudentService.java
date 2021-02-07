package com.coconut.hey8;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class StudentService {
	
	//학생의 정보를입력하는 클래스
	// 메서드 명은 StudentInput;
	// 학생의 숫자를 입력받음.
	// 학생의 정보를 입력받음.
	// 학생들을 리턴한다.
	
	
	public Student[] StudentInput() {
		Scanner sc= new Scanner(System.in);
		System.out.println("학생의 숫자를 입력");
		int n= sc.nextInt();
		
		Student student = new Student();
		
		Student [] stu= new Student[n];
		
		System.out.println("학생의 정보를 입력하세요.");
		
		for(int i=0; i<stu.length; i++) {
			System.out.println("학생의 이름");
			student.name=sc.next();
			System.out.println("학번");
			student.num=sc.nextInt();
			System.out.println("국어점수");
			student.kor=sc.nextInt();
			System.out.println("영어점수");
			student.eng=sc.nextInt();
			System.out.println("수학점수");
			student.math=sc.nextInt();
			student.total= student.kor+student.eng+student.eng;
			student.avg= student.total/3.0;
			stu[i]=student;
			
		}
		return stu;
		
		
	}
	
	//StudentView
	//학생들의 정보를 받아서 정보를 출력하는 메서드.
	
	public void StudentView(Student[] stu) {
		Student student=new Student();
		//정보출력하기.
		
		for(int i=0;i<stu.length;i++) {
			System.out.println("이름:"+stu[i].name+"학번:"+stu[i].num+"국어:"+stu[i].kor+"수학:"+stu[i].math+"영어:"+stu[i].eng+"총점:"+stu[i].total+"평균:"+stu[i].avg);
		}
		
	}
	
	//학생정보 검색
	public void StudentSearch(Student[] stu) {
		Student students= new Student(); //객체생성하기.		
		//찾은 학생 검색하는 부분 
		Scanner sc= new Scanner(System.in);
		System.out.println("검색할 학생의 학번을 입력하세요");
		int n= sc.nextInt();
		
		for(int i=0; i<stu.length; i++) {
			if(n==stu[i].num) {
				System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균\t");
				System.out.print(stu[i].name+"\t");
				System.out.print(stu[i].num+"\t");
				System.out.print(stu[i].kor+"\t");
				System.out.print(stu[i].eng+"\t");
				System.out.print(stu[i].math+"\t");
				System.out.print(stu[i].total+"\t");
				System.out.println(stu[i].avg+"\t");
				System.out.println("--------------------------------------------------");
			}
		}
		
		
	}
	
	public void StudentAdd(Student[] stu) {
		Student students= new Student(); 
		Student [] stua= new Student[stu.length+1];
		
		Scanner sc= new Scanner(System.in);
		
		// 기존 데이터 먼저 복사하기
		for(int i=0; i<stu.length; i++) {
			stua[i].name= stu[i].name;
			stua[i].num= stu[i].num;
			stua[i].kor= stu[i].kor;
			stua[i].eng= stu[i].eng;
			stua[i].math= stu[i].math;
			stua[i].total= stu[i].total;
			stua[i].avg= stu[i].avg;
			
		}
		
		System.out.println("추가할 학생 정보를 입력하세요.");
		
		int i=0;
		
		System.out.println("학생의 이름");
		stua[stua.length-1].name=sc.next();
		System.out.println("학번");
		stua[stua.length-1].num=sc.nextInt();
		System.out.println("국어점수");
		stua[stua.length-1].kor=sc.nextInt();
		System.out.println("영어점수");
		stua[stua.length-1].eng=sc.nextInt();
		System.out.println("수학점수");
		stua[stua.length-1].math=sc.nextInt();
		stua[stua.length-1].total= stua[stua.length-1].kor+stua[stua.length-1].eng+stua[stua.length-1].eng;
		stua[stua.length-1].avg= stua[stua.length-1].total/3.0;
		
		stu[name]=stua;
		
		
			
		
		return stu;
		
		
	}
	
	public void StudentDelete() {
		
		
	}

	
	//Start Method
}

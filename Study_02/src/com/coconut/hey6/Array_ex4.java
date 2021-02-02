package com.coconut.hey6;

import java.util.Scanner;


public class Array_ex4 {

	public static void main(String[] args) {



		//성적관리 프로그램
		//n명의 학생
		//학생의 이름, 번호, 국어, 영어, 수학, 총점, 평균

		//학생수의 수 입력:3
		Scanner sc = new Scanner(System.in);
		String [] names = null;
		int [] nums = null;
		int [] kors = null;
		int [] engs = null;
		int [] maths = null;
		int [] totals = null;
		double [] avgs = null;

		System.out.println("학생수를 입력하세요");
		int num = sc.nextInt();

		names = new String[num];
		nums = new int [names.length];
		kors = new int [names.length];
		engs = new int [names.length];
		maths = new int [names.length];
		totals = new int [names.length];
		avgs = new double [names.length];
		
		//삭제용 배열.
		String [] namesd = new String[names.length-1];
		int [] numsd = new int [names.length-1];
		int [] korsd = new int [names.length-1];
		int [] engsd = new int [names.length-1];
		int [] mathsd = new int [names.length-1];
		int [] totalsd = new int [names.length-1];
		double [] avgsd = new double [names.length-1];


		boolean check=true;

		while(check) {
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생전체정보출력");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 우수학생 출력");
			System.out.println("5. 학생검색삭제");
			System.out.println("6. 학생정보추가");
			System.out.println("7. 프로그램 종료");
			num = sc.nextInt();

			switch(num) {
			case 1:
				System.out.println("정보입력 코드 작성");
				for(int i=0;i<names.length;i++) {
					System.out.println(i+1+" 번째 이름 입력");
					names[i] = sc.next();
					System.out.println(names[i]+" 번호 입력");
					nums[i] = sc.nextInt();
					System.out.println(names[i]+" 국어 입력");
					kors[i] = sc.nextInt();
					System.out.println(names[i]+" 영어 입력");
					engs[i] = sc.nextInt();
					System.out.println(names[i]+" 수학 입력");
					maths[i] = sc.nextInt();

					totals[i] = kors[i]+engs[i]+maths[i];
					avgs[i]= totals[i]/3.0;
				}

				break;
			case 2:
				System.out.println("전체 정보 출력 작성");

				System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균\t");

				for(int i=0;i<names.length;i++) {
					System.out.print(names[i]+"\t");
					System.out.print(nums[i]+"\t");
					System.out.print(kors[i]+"\t");
					System.out.print(engs[i]+"\t");
					System.out.print(maths[i]+"\t");
					System.out.print(totals[i]+"\t");
					System.out.println(avgs[i]+"\t");
					System.out.println("--------------------------------------------------");
				}


				break;
			case 3:
				System.out.println("검색할 학생 번호 입력");
				num = sc.nextInt();

				for(int i=0;i<names.length;i++) {
					if(num==nums[i]) {
						System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균\t");
						System.out.print(names[i]+"\t");
						System.out.print(nums[i]+"\t");
						System.out.print(kors[i]+"\t");
						System.out.print(engs[i]+"\t");
						System.out.print(maths[i]+"\t");
						System.out.print(totals[i]+"\t");
						System.out.println(avgs[i]+"\t");
						System.out.println("--------------------------------------------------");
						check=false;
					}
				}//for 끝

				if(check) {
					System.out.println("해당 번호의 학생정보는 없습니다");
				}

				check=true;

				break;
			case 4:
				System.out.println("최우수 학생 출력");
				double max= avgs[0];//최댓값 
				int idx=0;
				for(int i=1; i<names.length;i++) {
					if(max<avgs[i]){
						max=avgs[i];
						idx=i;
					}
				}//for
				System.out.println("최우수학생은"+names[idx]+"평균"+max);

				break;
			case 5:
				System.out.println("학생검색삭제");
				System.out.println("몇번을 삭제하시겠습니까");
				//삭제한걸 넣을 배열

				int n=sc.nextInt(); // 입력할 번호
				int i=0;
				int idx1=0; //다시 들어갈 배열에 넣을 idx 선언숫자.

				for(i=0; i<names.length;i++) {	
					if (n==nums[i]) {
						System.out.println("find");
						continue;
					}		
					namesd[idx1]= names[i];
					numsd[idx1]= nums[i];
					korsd[idx1]= kors[i];
					engsd[idx1]= engs[i];
					mathsd[idx1]= maths[i];
					totalsd[idx1]= totals[i];
					avgsd[idx1]= avgs[i];

					idx1++;
				}

				names=namesd;
				nums=numsd;
				kors= korsd;
				engs=engsd;
				maths=mathsd;
				totals=totalsd;
				avgs=avgsd;



				System.out.println("삭제되었습니다. 남은 학생을 확인하세요.");
				break;
			case 6:
				// 학생정보 추가하기.
				//추가용 배열
				String [] namesp = new String[names.length+1];
				int [] numsp = new int [names.length+1];
				int [] korsp = new int [names.length+1];
				int [] engsp = new int [names.length+1];
				int [] mathsp = new int [names.length+1];
				int [] totalsp = new int [names.length+1];
				double [] avgsp = new double [names.length+1];
				
				
				System.out.println("학생 정보를 추가합니다.");
				int idx2=0; //증가된 배열.. 
				
				//기존 데이터 복사하기
				for(i=0; i<names.length; i++) {
					namesp[i]= names[i];
					numsp[i]= nums[i];
					korsp[i]= kors[i];
					engsp[i]= engs[i];
					mathsp[i]= maths[i];
					totalsp[i]= totals[i];
					avgsp[i]= avgs[i];
					
				}

				System.out.println(names.length+1+" 번째 이름 입력");
				namesp[namesp.length-1] = sc.next();
				System.out.println(" 번호 입력");
				numsp[namesp.length-1] = sc.nextInt();
				System.out.println(" 국어 입력");
				korsp[namesp.length-1] = sc.nextInt();
				System.out.println(" 영어 입력");
				engsp[namesp.length-1] = sc.nextInt();
				System.out.println(" 수학 입력");
				mathsp[namesp.length-1] = sc.nextInt();
				
				totalsp[namesp.length-1] = korsp[namesp.length-1]+engsp[namesp.length-1]+mathsp[namesp.length-1];
				avgsp[namesp.length-1]= totalsp[namesp.length-1]/3.0;
				names=namesp;
				nums=numsp;
				kors= korsp;
				engs=engsp;
				maths=mathsp;
				totals=totalsp;
				avgs=avgsp;	

				
				break;
			case 7:
				System.out.println("프로그램 종료 코드");
				//check = false;
				check = !check;
				break;
			default:
				System.out.println("잘못된 번호 입니다..");
			}


		}//while 끝

		System.out.println("---- 종료 ----");
		//1. 학생정보입력
		//    -- 학생의 수만큼 이름, 번호, 국어, 영어, 수학
		//    -- 번호는 중복불가
		//    -- 총점과 평균(소수점 자리 포함) 계산	
		//2. 학생전체정보출력
		//    -- 전체 학생의 모든 정보 출력
		//    -- 학생의 이름, 번호, 국어, 영어, 수학, 총점, 평균
		//3. 학생정보검색
		//    -- 검색할 학생 번호를 입력
		//    -- 학생의 이름, 번호, 국어, 영어, 수학, 총점, 평균
		//    -- 입력한 번호가 없으면 정보 없음을 출력
		//4. 프로그램종료

	}

}
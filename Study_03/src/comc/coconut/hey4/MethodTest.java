package comc.coconut.hey4;

public class MethodTest {
	
	//접근지정자 + 그외지정자 + 리턴타입+ 메서드이름 (매개변수 선언 부분) { };
	//접근지정자 : 모르면 public
	//그외지정자 : 모르면 생략, 사용금지
	// 리턴타입 : 잘 모르면 void 
	//매개변수선언: 모르면 생략 
	
	public void info () {
		
		//메인 메서드 내의 내용처럼 작성
		// if, for, while
		//객체생성, 변수선언
		
		System.out.println("이건 Info Method 실행");
		//int num= 10;
		//System.out.println("int :"+num);
		System.out.println("종료!");
		
	}
	
	//say Hello 로 된 메서드 선언하고 
	// Hello world 라는 출력문ㄹ
	
	public void SayHello() {
		System.out.println("Hello World");

	}
	
	public void SayHello2() {
		System.out.println("hello world");
	}
	
	

}

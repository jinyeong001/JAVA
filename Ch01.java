//01 JAVA 주석
// 주석 : 프로그램 코드 내에 삽입된 사용자의 메모를 의미.

// 여러줄 주석처리 할 떄 : CTRL + /

// 쓰는 이유 : 1. 개발을 하다 보면 코드에 대한 설명이 필요.
// 			2. 협업할 떄 다른 개발자와의 의사소통에도 필요.

//02 JAVA 기본 구조
public class Ch01 { // Class area - 객체 지향 코드 구현 단위.

//		public class Ch01 : 1. 하나의 public class 시작.
//							2. 클래스(Ch01)는 파일이름(Ch01.java)과 동일해야 함.
//							3. 그 내부에 main method 포함되어야 한다.	

	public static void main(String[] args) { // method area - 절차 지향 구현 단위
//		## 메서드의 정의와 종료 ##
//		0. method(기능) : 특정 기능 수행. C언어의 함수 개념과 유사
//		1. main method : 최초 실행되는 함수
//		2. library method : 개발편의를 위해서 미리 만들어져 제공되는 함수
//		3. 사용자 정의 method : 개발자가 정의한(만든) 함수

//		0. main method : 프로그램의 진입점, 자바 가상머신(Java Virtual Machine)은 이 method를 찾아 실행.
//		1. public : 어디에서든 접근 가능할 수 있도록 설정. main method는 어디서든 접근 가능해라.
//		2. static : main method는 객체의 생성 없이 호출될 수 있도록 static으로 선언되어야 한다.
//		3. void : 반환값이 없다. main method는 어떤 값을 반환하지 않도록 void 선언되어야 한다.
//		4. String[] args : main method는 문자열 배열을 매개변수로 받는다. 
//		5. {} : 내부에서 프로그램 실행 시 실행될 코드 작성 -> 중괄호 안에서 프로그램 로직 구성.
//		System.out.println("Hello world"); // 출력함수 실행, call
		// ';' : 코드의 마침표 역할
		// 모니터에 우리가 작성한 텍스트를 console 창에 출력하는 역할(기능)

		// 03 ESCAPE 문자
		// '정보 표시' 목적으로 사용된 기존 그래픽문자(영소문자,숫자,특수문자)와는 다르게
		// '제어'목적으로 사용되는 특수문자 '\(역슬래쉬)'를 앞에 붙여 사용

		// 1. \n : 개행(줄바꿈)
		// 2. \t : Tap key의 약어 - 탭키만큼 이동
		// 3. \", \' : 큰따옴표, 작은따옴표 출력
//		System.out.println("\nHello world");
//		System.out.println("\tHello world");
//		System.out.println("\"Hello\" \"world\"");

		// System.out : 표준 출력 스트림
		// System.out.print() : 줄바꿈 X
		// System.out.println() : 줄바꿈 O (ln == \n)
		// System.out.printf() : 서식문자를 사용할 수 있는 출력 메서드, printf의 의미 (format: 형식, 서식)

//		System.out.println("    *");
//		System.out.println("   ***");
//		System.out.println("  *****");
//		System.out.println(" *******");
//		System.out.println("*********");

		// CLTR + F11 : 실행 단축키

		// 서식 : 서류를 꾸미는 일정한 양식

		// 서식문자란? : 서식공간에 자료를 대입하여 화면에 출력하거나 입력받기 위한 용도의 문자
		// %d : 10진수(정수) 서식문자
		// %f : 10진수(실수) 서식문자
		// %c : 한문자 서식문자
		// %s : 문자열

//		System.out.printf("%d \n", 100);
//		System.out.printf("%d \n", 100+200);
//		System.out.printf("%d %d %d\n", 100,200,300);
//		
//		System.out.printf("%f \n", 123.123);
//		System.out.printf("%.3f \n", 123.123);

		// 문자 : 영어기준, 한글은 문자열로 표시
//		System.out.printf("%c \n", 'A');
//		System.out.printf("%s", "JAVA");
//		
//		System.out.printf("%d %s : %d", 1, "국어", 100);

//		System.out.printf("%s\t%s\t%s\t%s\t%s\n", "NO","이름","나이","성별","주소");
//		System.out.printf("%d\t%s\t%d\t%c\t%s\n", 1,"박원민",11,'M',"대구");
//		System.out.printf("%d\t%s\t%d\t%s\t%s\n", 2,"코리아",12,'W',"대구");
//		System.out.printf("%d\t%s\t%d\t%s\t%s", 3,"IT",32,'M',"대구");

//		System.out.printf("이름 : %s\n", "홍길동");
//		System.out.printf("나이 : %d\n", 12);
//		System.out.printf("성별 : %c\n", 'M');
//		System.out.printf("키  : %.1f\n", 192.2);
//		System.out.printf("주소 : \"%s\"", "대구광역시 중구 중앙대로 366 10층");
	}

}

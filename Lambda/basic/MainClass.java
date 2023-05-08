package day22_0508.api.Lambda.basic;

public class MainClass {

	public static void main(String[] args) {

		/*
		//car의 run을 사용할 때 마다 매번 다른기능으로 사용해야 한다면 -> 익명 클래스를 사용할 수 있다.
		Car car = new Car() {
			
			@Override
			public void run() {
				System.out.println("익명 객체로 생성 죈 car");
			}
		};
		
		car.run();
	
		Car car2 = new Car() {
			
			@Override
			public void run() {
				System.out.println("다른 내용의 익명 객체로 car 생성");
			}
		};
		car2.run();
		*/
		
		// 익명객체 표현 문법 -> 람다 표현형식으로 사용이 가능
		Person p = new Person();
		p.greeting(new Say01()	 {

			@Override
			public void hello() {
				System.out.println("헬로우 가능");
			}
			
		});
		
		// Say01이 가지고 있는 hello()를 전달하는 모형
		p.greeting(() -> {System.out.println("람다식 표현");});
		
		// 1문법 - 사용할 문장이 1줄 이라면 {} 생략 가능
		p.greeting(() -> System.out.println("람다식 표현"));
		
		// 1.문법
//		p.greeting(new Say02() {
//		
//			public String hello(String a, int b) {
//				// 프로그래머가 작성한 내용
//				return a + b;	// 문자열로 반환
//			}
//			
//		});
		
		// 2.문법 -  위 코드를 람다식으로
//		p.greeting((a, b) -> {	//매개변수 타입 생략 가능
//			return a + b;
//		});
		
		// 3.문법 - {}, 매개변수 타입, return 생략 -> 1줄 일 때
		p.greeting((a, b) -> a + b);
		
		// Quiz. greeting의 3번째 메서드에 전달되는 값이 짝수?홀수인지 판별
		p.greeting((a) -> a % 2 == 0 ? true : false);
		
	}
}

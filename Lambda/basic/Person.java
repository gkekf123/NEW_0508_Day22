package day22_0508.api.Lambda.basic;

public class Person {

	// 일반 클래스 - 고차함수를 가지고 있는 클래스
	
	public void greeting(Say01 say01) {	// () = 함수적 인터페이스
		say01.hello();	// 대신 실행(이미 만들어져 있음)
	}
	
	public void greeting(Say02 say02) {
		String result = say02.hello("greeting이 전달한 문자열", 1);
		System.out.println(result);
	}
	
	public void greeting(Say03 say03) {
		boolean result = say03.bye(3);
		System.out.println(result);
	}
	
}

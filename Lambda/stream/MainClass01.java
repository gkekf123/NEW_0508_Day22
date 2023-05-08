package day22_0508.api.Lambda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass01 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("홍길자");
		list.add("이순신");
		list.add("신사임당");
		list.add("홍길동");
		
		// 스트림
		Stream<String> stream = list.stream();
		
//		stream.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//			
//		});
	
		// 위 코드를 람다식으로 
		stream.forEach((t) -> System.out.println(t));
	
	}

}

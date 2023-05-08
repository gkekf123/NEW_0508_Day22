package day22_0508.api.Lambda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleBiFunction;
import java.util.stream.Stream;

public class MainClass02 {

	public static void main(String[] args) {
		
		/* 
		 * 람다 함수의 구현 사용 문법
		 * Predicate - 매개변수가 하나 있고, boolean형 반환
		 * Consumer - 매개변수 하나 받고, void 메서드 반환(forEach문)
		 * Function - 매개변수 여러 개 받고, 반환은 임의의 값
		 */

		List<Integer> list = new ArrayList<>();
		
		Random ran = new Random();
		for(int i = 0; i <= 100; i++) {
			list.add(ran.nextInt(100) +1);	//1 ~ 100까지
		}
		System.out.println(list.toString());
		
		// 충간 처리 함수들
		//distinct() - 중복 제거 - 한줄 코드를 사용할 수 없다
//		Stream<Integer> stream = list.stream();
//		stream = stream.distinct();
//		stream.forEach((a) -> System.out.print(a + " "));
		list.stream().distinct().forEach((a) -> System.out.print(a + " "));
		
		System.out.println("\n======================================================");
		
		// sort() - 정렬
		list.stream().sorted().forEach((a) -> System.out.print(a + " "));
		
		// filter()	- 리턴에 true값만 남기고 필터링
//		list.stream().distinct().filter(new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer t) {
//				return false;
//				
//				
//			}
//		});
		
		System.out.println("\n======================================================");
		
		// filter() - 리턴에 true값만 남기고 필터링 - 짝수만
		list.stream().distinct().filter((a) -> a % 2 == 0).sorted().forEach( a -> System.out.print(a + " "));	// forEach의 매개변수가 하나면 생략가능
		
		System.out.println("\n======================================================");
		
		// map() - 반환에 정의 된 값으로 완전히 새로운 스트림반환
//		list.stream().map(new Function<Integer, String>() {
//
//			@Override
//			public String apply(Integer t) {
//				return null;
//				
//				
//			}
//
//			
//		});
		list.stream().map((a) -> a % 2 == 0 ? "짝수" : "홀수" ).forEach(a -> System.out.print(a + " "));
//			{ String str;
//			if(a % 2 == 0) {
//				str = "짝수";
//			} else {
//				str = "홀수";
//			}
//			return str;
//		}); 
		
		// mapToDouble() - 반환에 정의 된 값으로 double형 스트림변경
		// mapToInt()() - int형 스트림으로 변경
		// mapToLong() - Long타입 스트립으로 변경
		list.stream().mapToDouble(a -> a).forEach(a -> System.out.println(a + " "));


		
		
		
	}

}

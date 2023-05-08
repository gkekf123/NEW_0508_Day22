package day22_0508.api.Lambda.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainClass03 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		Random ran = new Random();
		for(int i = 0; i < 100; i++) {
			list.add(ran.nextInt(100) +1);	//1 ~ 100까지
		}
		System.out.println(list.toString());
		
		
		// collect() - 최종집계 함수
		List<Integer> newList = list.stream().filter(a -> a % 3 == 0).collect(Collectors.toList());
		System.out.println(newList.toString());
		
		Set<Integer> newSet = list.stream().filter(a -> a % 3 == 0).collect(Collectors.toSet());
		System.out.println(newSet.toString());
		
		
		System.out.println("==============================================================================================================================================");
		
		
		// sum(), count(), avg(), max(), min() - 숫자를 다루는 스트림에서만 사용
		int r1 = list.stream().distinct().mapToInt(a -> a).sum();
		System.out.println("합계 : " + r1);
		
		long r2 = list.stream().distinct().mapToInt(a -> a).count();
		System.out.println("개수 : " + r2);
		
		OptionalDouble r3 = list.stream().distinct().mapToInt(a -> a).average();
		System.out.println("평군 : " + r3.getAsDouble());
		
		OptionalInt r4 = list.stream().distinct().mapToInt(a -> a).max();
		System.out.println("최대 값: " + r4.getAsInt());
		
		OptionalInt r5 = list.stream().distinct().mapToInt(a -> a).min();
		System.out.println("최솟 값 : " + r5.getAsInt());
		
		
		System.out.println("==============================================================================================================================================");
		
		
		// list에서 50보다 큰 값만 중복없이 저장하는 새로운 리스트 생성
		List<Integer> result = list.stream().distinct().filter(t -> t > 50).collect(Collectors.toList());
		System.out.println(result.toString());
	
		
		System.out.println("==============================================================================================================================================");
		
		
		// 미만까지 정수 스트림반환
		IntStream.range(1, 10).forEach(a -> System.out.print(a + " "));
		
		System.out.println();
		
		// 포함 정수 스트림반환
		IntStream.rangeClosed(1, 10).forEach(a -> System.out.print(a + " "));
	
		System.out.println();
		
		int result2 = IntStream.rangeClosed(1, 100).sum();
		System.out.print(result2);
		
		// 정수 스트림 -> 일반스트림 형 변환
		Stream<Integer> stream = IntStream.rangeClosed(1, 100).boxed();
		
		
		
		
	
	}

}

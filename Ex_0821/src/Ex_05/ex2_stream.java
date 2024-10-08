package Ex_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class ex2_stream {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("신용권");
		set.add("김미나");
		
		//Stream을 이용한 요소 반복 처리
		Stream<String> stream = set.stream();
		stream.forEach(System.out::println);
		
		//Stream은 Iterator와 비슷한 반복자이지만, 다음과 같은 차이점을 가지고 있다.
		//1) 내부 반복자이므로 처리 속도가 빠르고 병렬처리에 효율적이다.
		//2) 람다식으로 다양한 요소 처리를 정의할 수 있다.
		//3) 중간 처리와 최종 처리를 수행하도록 파이프 라인을 형성할 수 있다.

		List<Integer> list = Arrays.asList(1,2,3,4,5);

		
		Stream<Integer> intStream = list.stream();
		intStream.forEach(System.out::println);
		

	}

}

package Ex_05;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ex3_stream {

	public static void main(String[] args) {
		//특정 범위의 정수를 요소로 갖는 스트림 생성하기
		IntStream intStream = IntStream.range(1, 5); // 1,2,3,4
		LongStream longStream = LongStream.rangeClosed(1, 5); // 1,2,3,4,5

		Stream<Integer> boxedIntStream = IntStream.range(1, 5).boxed();
		
		
	
	}

}

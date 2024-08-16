package ex01_lamda;

import java.util.function.Function;

public class Ex05_lamda {

	public static void main(String[] args) {
		//16진수 -> 10진수 변환
		Function<String, Integer> f = s -> Integer.parseInt(s,16);
		
		//2진수로 변환
		Function<Integer, String> g = i -> Integer.toBinaryString(i);

		
		Function<String, String> h = f.andThen(g); 
		
		System.out.println(h.apply("FF"));
		
		Function<Integer, String> x = i -> Integer.toBinaryString(i);
		Function<String, Integer> y = s -> Integer.parseInt(s,16);
		Function<Integer, Integer> z = f.compose(g); 
		System.out.println(z.apply(2));
	}

}

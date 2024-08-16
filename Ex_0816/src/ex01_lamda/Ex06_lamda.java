package ex01_lamda;

import java.util.function.Predicate;

public class Ex06_lamda {

	public static void main(String[] args) {
		Predicate<Integer> a = i -> i < 100;
		Predicate<Integer> b = i -> i < 200;
		Predicate<Integer> r = i -> i % 2 == 0;
		Predicate<Integer> notA = a.negate(); // i >= 100
		
		System.out.println("a : " + a.test(101));
		System.out.println("notA : " + notA.test(101));
		
		Predicate<Integer> all = notA.and(b.or(r));
		System.out.println(all.test(150)); // true
		
		String str1 = "abc";
		String str2 = "abc";
		
		// str1과 str2가 같은지 비교한 결과를 반환
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
		System.out.println(result);
	}

}

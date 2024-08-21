package Ex_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ex5_stream {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("홍길동");
		list1.add("신용권");
		list1.add("감자바");
		list1.add("람다식");
		list1.add("박병렬");
		
		//Collections.sort(list1);
		//System.out.println(list1);
		
		
		//Collectors란 "stream을 일반적인 List,Set등으로 변경시키는 Stream메서드)
		//toCollection()을 이용하여 좀 더 특정한 컬렉션으로 구현이 가능하다.
		ArrayList<String>list1_1 = list1.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(list1_1);
		
		//배열 
		String[] list2 = {"홍길동","신용권","감자바","람다식","박병령"};
		
		//Arrays.sort(list2);
		//System.out.println(Arrays.toString(list2));
		
		String[] list2_1 = Arrays.stream(list2).sorted().toArray(String[]::new);
		System.out.println(Arrays.deepToString(list2_1));
	}

}

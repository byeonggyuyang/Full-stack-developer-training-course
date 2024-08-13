package ex04_Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex01_Iterator {

	public static void main(String[] args) {
		/*
	 	반복자(Iterator)
		List 컬렉션의 요소를 순회하여 하나씩 추출하는데 사용한다.
		반복자라고도 불리는 Iterator객체는 선언된 컬렉션 객체에서 가져와 사용된다.
		*/
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Iterator<Integer> iter = list.iterator();
		int count = 0;
		
		while(iter.hasNext()) {
			int val = iter.next();
			System.out.printf("list 데이터 [%d] : %d\n",count++,val);
		}
	}

}

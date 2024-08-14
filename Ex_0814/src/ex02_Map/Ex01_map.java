package ex02_Map;

import java.util.HashMap;
import java.util.Map;

public class Ex01_map {
	public static void main(String[] args) {
		Map<Integer, Character> map = new HashMap<Integer, Character>();
		//map 데이터 추가
		
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		map.put(4, 'D');
		
		System.out.println(map);
		
		//value 중복 가능, key 중복 불가능

		map.put(5, 'A');
		System.out.println(map);
		
		map.put(5, 'C'); //같은 키를 가지고 있으면 Value값이 변함
		System.out.println(map);
		
		//map 삭제시 key값 입력 ( 5 ) 
		map.remove(5);
		System.out.println(map);
		//map 크기
		System.out.println(map.size());
		
		//데이터 가져올때 key값을 입력하여 value값 가져옴
		char res = map.get(1);
		System.out.println(res);
		
	}

}

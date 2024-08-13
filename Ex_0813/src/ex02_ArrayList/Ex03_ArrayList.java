package ex02_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex03_ArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i < 10; i++)
		{
			//2의 배수 리스트에 삽입
			int tmp = 2 * i;
			list.add(tmp);
		}
		System.out.println(list);
		
		//인덱스 활용한 리스트 데이터 삭제 ( value : 8 삭제 )
		list.remove(3);
		System.out.println(list);
		
		//지정 숫자 삭제 ( value : 10 삭제 )
		list.remove(Integer.valueOf(10));
		System.out.println(list);
		
		//전체 삭제
		list.clear();
		System.out.println(list);
	}

}

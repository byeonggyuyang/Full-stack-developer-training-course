package ex02_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex04_ArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for(int i = 1; i < 10; i++)
		{
			int tmp = (int)(Math.random() * 30 + 1);
			list.add(tmp);
		}
		
		System.out.println(list);
		
		//전체 리스트 중 짝수만 출력
		
		for(int i = 0; i < list.size(); i++)
		{
			//리스트의 값을 value에 삽입
			int value = list.get(i);
			
			if(value % 2 == 0)
			{
				System.out.println(value);
			}
		}
		
		for(int value : list)
		{
			System.out.print(value);
		}
	}

}

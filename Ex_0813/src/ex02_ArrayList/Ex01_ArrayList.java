package ex02_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("딸기");
		list.add("바나나");
		list.add("망고");
		
		System.out.println(list);

		list.add(1, "수박");

		System.out.println(list);
	}

}

package ex02_ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex05_LinkedList {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		
		startTime = System.nanoTime();
		
		for(int i = 9999; i >= 0; i--)
		{
			arrayList.remove(i);
		}
		
		endTime = System.nanoTime();

		long druation = endTime - startTime;
		
		System.out.println(druation);
		
		
		
	}

}

package ex03_Set;

import java.util.HashSet;
import java.util.Random;

public class Ex02_HashSet {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while(true)
		{
			int r = new Random().nextInt(45) + 1;	
			hs.add(r);
			
			if(hs.size() == 6) {
				break;
			}
		}
		System.out.println(hs);
		
		
		
		//Set -> 배열 형태로 변환
		//new Integer[0] <-- 배열의 방 개수를 0으로 잡으면 set이 add해둔 방 개수만큼
		//자동으로 배열의 index가 생성된다.
		Integer[] arr = hs.toArray(new Integer[0]);
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}

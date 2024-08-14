package ex02_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex03_map {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("aaa", 1111);
		map.put("lee", 3333);
		map.put("park", 3333);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		int pw = sc.nextInt();
		
		if(!map.containsKey(id))
		{
			System.out.println("ID 없음");
		}
		else {
			if(map.get(id) == pw)
			{
				System.out.println("로그인 성공");
			}
			else
			{
				System.out.println("비밀번호 다름");
			}
		}

	}

}

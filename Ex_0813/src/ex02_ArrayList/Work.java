package ex02_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Work {

	public static void main(String[] args) {
		//아이디 생성 후 중복된 ID검사 로직
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		/* 방식 1
		while(true) 
		{
			System.out.print("아이디 생성 : ");
			String id = sc.next();

			for(int i = 0; i < list.size(); i++)
			{
				if(id.equals(list.get(i)))
				{
					System.out.println("중복된 ID");
					
					int lastIndex = list.size() - 1; //list에 추가된 마지막 인덱스 가져오기
					list.remove(lastIndex);
					
					break;
				}
			}
			list.add(id);
			
			System.out.printf("ID : %s\n", list);
			System.out.println("-----------------------------------");
		}
		*/
		
		/* 방식2 ( Lable문 사용 최상단 반복문을 벗어나기 위해 사용함 )
		*/
		out : while(true)
		{
			System.out.print("아이디 생성 : ");
			String id = sc.next();
			
			for(int i = 0; i < list.size(); i++)
			{
				if(list.size() ==4 )
				{
					break out;
				}
				
				if(id.equals(list.get(i)))
				{
					System.out.println("중복된 ID : " + id);

					break out;
					//label문 break에 걸리면 밑에 구문은 아예 안씀
				}
				
			}
			list.add(id);
			
			System.out.printf("ID : %s\n", list);
			System.out.println("-----------------------------------");
		}
		System.out.printf("ID : %s\n", list);
		System.out.println("-----------------------------------");
	}
}

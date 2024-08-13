package ex02_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {

	public static void main(String[] args) {
		Person p;
		ArrayList<Person> list = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("1. 정보추가\n");
			System.out.print("2. 정보삭제\n");
			System.out.print("3. 전체정보\n");
			System.out.print("4. 종료\n");
			
			System.out.print("항목입력 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum)
			{
				//정보추가
				case 1 :	
					p = new Person();
					
					System.out.print("이름 : ");
					
					p.setName(sc.next());
							
					System.out.print("나이 : ");
					p.setAge(sc.nextInt());
										
					System.out.print("번호 : ");					
					p.setTel(sc.next());		
					
					list.add(p);
					
					break;
								
				//정보삭제	
				case 2 :
					System.out.print("삭제할 이름 : ");
					String personName = sc.next();
					
					for(int i = 0; i < list.size(); i++)
					{
						if(list.get(i).getName().equals(personName))
						{
							list.remove(i);
							System.out.printf("삭제 완료\n");
							break;
						}
					}
				//전체정보	
				case 3 :
					System.out.printf("등록인원 %d명\n", list.size());
					
					for(int i = 0; i < list.size(); i++)
					{
						System.out.printf("이름 : %s\n", list.get(i).getName());
						System.out.printf("나이 : %s\n", list.get(i).getAge());
						System.out.printf("번호 : %s\n", list.get(i).getTel());
					}
					break;
					
				//종료	
				default : 
					System.out.println("프로그램 종료");
					return;
			}
		}
	}

}

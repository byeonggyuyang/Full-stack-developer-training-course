package Ex_04;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {	
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		
		outer : 
			while(true)
			{		
				System.out.print("id생성 : ");
				Scanner sc = new Scanner(System.in);	
				UserInfo user = new UserInfo();
				
				user.setId(sc.next()); 
				
				for(int i = 0; i < list.size(); i++)
				{
					if(user.getId().equals(list.get(i).getId()))
					{
						System.out.println("id중복");
						break outer;
					}

				}
				
				System.out.print("pw생성 : ");
				user.setPwd(sc.nextInt()); 
				
				list.add(user);

				for(int i = 0; i < list.size(); i++){
					System.out.println(list.get(i).getId());
					System.out.println(list.get(i).getPwd());
					System.out.println("------------------------");
				}
			}
		
		
		
		
		
		

	}

}

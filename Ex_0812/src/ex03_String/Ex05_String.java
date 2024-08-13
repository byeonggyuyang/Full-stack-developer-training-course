package ex03_String;

import java.util.Scanner;

public class Ex05_String {

	public static void main(String[] args) {
		/*
		문자열 s는 키보드에서 입력받고
		s의 길이가 4 또는 6 숫자로만 구성되어있는지
		예시 a234면 false 1234aus true
		
		 s는 길이 1<=8
		 영문 알파벳 대소문자 또는 0~9까지의 숫자로 이루어짐
		*/
		Scanner sc = new Scanner(System.in);
		

		System.out.println("입력 : ");
		
		boolean res = true;
		String s = sc.next();
		char tmp;

		if(s.length() == 4 || s.length() == 6) 
		{

			for(int i = 0; i < s.length(); i++)
			{
				tmp = s.charAt(i);
				if(!Character.isDigit(tmp)) //숫자만 있는지 확인하는 방법
				{
					res = false;
					System.out.println(res);
					return;
					
				}
				else 
				{
					if(s.charAt(i) < 0 || s.charAt(i) > 9)
					{
						res = true;
					}
					else
					{
						res = false;
					}
				}

			}
			
			
		}
		System.out.println(res);
		
		
//		if(s.length() == 4 || s.length() == 6) {
//			try {
//				int n = Integer.parseInt(s);
//				
//			}
//			catch (Exception e) {
//				
//			}
//		}
	}

}

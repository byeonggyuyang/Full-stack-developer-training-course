package ex03_String;

import java.util.Scanner;

public class Ex03_String {

	public static void main(String[] args) {
		/*
		 키보드에서 문장을 입력받고 해달 문장이 회문인지 아닌지 판별
		*/
		Scanner sc = new Scanner(System.in);
		
		String str1 = "";
		String str2 = "";
		
		
		System.out.println("입력 : ");
		
		str1 = sc.next();
		
		for(int i = str1.length(); i > 0 ; i--)
		{
			str2 += str1.charAt(i-1);
		}
		
		if(str1.equals(str2))
		{
			System.out.println("회문");
		}
		else
		{
			System.out.println("회문아님");
		}
		
	}

}

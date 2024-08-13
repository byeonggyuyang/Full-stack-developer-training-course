package ex03_String;

import java.util.Scanner;

public class Ex02_String {

	public static void main(String[] args) {
		/*
		키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다
		입력답은 문자열에 소문자 a가 몇개 있는지 판별하기 
		입력 : asdfasdf
		a의 개수 : 2
		*/
		
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		
		str = sc.next();
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a')
			{
				cnt++;
			}
		}
		System.out.println("a의 개수 : " + cnt);
		

	}

}

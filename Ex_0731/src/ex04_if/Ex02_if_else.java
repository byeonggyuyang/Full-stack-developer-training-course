package ex04_if;

import java.util.Scanner;

public class Ex02_if_else {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		int age = scan.nextInt();
		
		if(age>19)
		{
			System.out.println("성인");
		}
		else if(age>8 && age<20)
		{
			System.out.println("미성년자");
		}
		else 
		{
			System.out.println("유치원이나 가삼");
		}
		//---------------------------------------------------//
		
		// 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		int x = 10;
		
		if(x>10 && x <20)
		{
			System.out.println(true);
		}
		
		// 2. char형 변수 ch가 'x'또는 'X'일때 true
	
		char ch = 'x';
		
		if(ch == 'x' || ch == 'X') 
		{
			System.out.println(true);
		}
		
		// 3. char형 변수 ch2가 알파벳일대 true
		
		/*
		  char ch3 = scan.next().charAt(0);
		  Scanner로 받는 입력값을 char형식으로 받는 방법
		*/
		
				
		char ch2 = 65;
		
		if(ch2 > 65 && ch2 <90) {
			System.out.println(true);
			ch2++;
		}
		
		// 4.삼항연사자로 만들었던 x개의 농구공을 담기위한 박스의 개수 구하기(조건문사용)
		/*
		  상자 하나에 농구공 5개
		  농구공이 23개라면 몇개 상자가 필요한가
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("공 개수 입력 : ");
		
		int fullbox = 5;
		int ballnum = sc.nextInt();
								
		if(ballnum%fullbox == 0)
		{
			System.out.println(ballnum/fullbox);
		}
		else 
		{
			System.out.println((ballnum/fullbox)+1);
		}
		
		//System.out.printf("필요한 상자 개수 : %d\n", box );

	}

}

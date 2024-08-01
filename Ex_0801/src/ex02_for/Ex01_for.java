package ex02_for;

import java.util.Scanner;


public class Ex01_for {

	public static void main(String[] args) {
		
		for (int k =1; k<=10; k++) {
			System.out.print(k+" ");
		}
		
		System.out.println("\n-----------------------------------");
		
		for (int k =10; k>=1; k--) {
			System.out.print(k+" ");
		}
		
		System.out.println("\n-----------------------------------");
		
		for (int k =1; k<=20; k++) {
			if(k % 2 != 0) {
				System.out.print(k+" ");
			}
		}
		
		System.out.println("\n-----------------------------------");
		
		for (int k=1; k<=10; k++) {
			if(k % 3 == 0) {
				System.out.print(k+" ");
			}
		}
		
		System.out.println("\n-----------------------------------");
		
		int sum = 0;
		for (int k=1; k<=10; k++) {
			
			sum += k;
		}
		System.out.println(sum);
		
		System.out.println("\n-----------------------------------");
		/*
		 정수형 변수 dan에 2~9사이의 값으로 초기화 하고
		 구구단 출력하기
		*/
		
		for(int i=2; i<=9; i++)
		{
			for(int j = 1; j<=9;j++)
			{
				System.out.printf("%d*%d=%d ",i,j,i*j);
			}
			System.out.println();
		}	
		System.out.println("\n-----------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		
		int t = sc.nextInt();
		int sum2 = 0;
		for(int i=1; i<=t; i++)
		{
			sum2 +=i;
		}
		System.out.print(sum2);

		System.out.println("\n-----------------------------------");
		/*
		 10개 정수 입력받아 짝수 몇개인지
		*/
		
//		int cnt = 0;
//		for(int i = 1; i<=10; i++) 
//		{
//			System.out.print("정수를 입력해주세요 : \n");
//			int num = sc.nextInt();
//			if(num % 2 == 0) {
//				cnt += 1;
//			}
//		}
//		System.out.printf("짝수 개수%d",cnt);
//		
		
		/*
		 정수 2개 입력받아 입력받은 x와 y사이의 총합을 출력
		*/
		
		System.out.print("x값 입력 : ");
		int x = sc.nextInt();
		System.out.print("y값 입력 : ");
		int y = sc.nextInt();
		int z = 0;
		int sum3 = 0;
		if(x>y)
		{
			z = x;
			x = y;
			y = z;
			for(int i = x; i<=y; i++) 
			{
				sum3 += i;
			}
		}
		for(int i = x; i<=y; i++) 
		{
			sum3 += i;
		}
		
		System.out.println(sum3);
		


	}

}

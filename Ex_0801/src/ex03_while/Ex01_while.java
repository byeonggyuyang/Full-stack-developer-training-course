package ex03_while;

import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
//		int num = 1;
		
//		while(num <= 10) 
//		{
//			System.out.println(num);
//			num++;
//		}
		
		System.out.println("---------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
//		int n = 0;
//		
//		while(n != -1) {
//			System.out.println("정수 입력 : ");
//			num++;
//			System.out.println(n);
//			
//			
//		}
/*
		int sum = 0;
		System.out.print("정수 입력 : ");
		int score = sc.nextInt();
		
		while(score > 0) {
			
			sum += score % 10;
			score /= 10;
			
		}
		System.out.println(sum);
*/
		System.out.println("---------------------------------------------");
		
		int x = 1;
		int y = 1;
		
		
		while (x != 6) {
			 y++;
			 if(x+y ==6)
			 {
				 System.out.printf("(%d,%d)",x,y);
				 x++;
				 y--;
				 System.out.println();
			 }
		}
		
		
		
		
	}

}

package Ex_01;

import java.util.Scanner;

public class ex01_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0; i <=n; i++)
		{
			sum += i;
		}
		System.out.println(sum);
	}

}

package Ex_02;

import java.util.Scanner;

public class TempMethod {
	
	
	public static void fToc() {
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨입력 : ");
		int f = sc.nextInt();
		double result = 1.8 * f + 32;
		System.out.printf("1.8 * %d + 32 = %.2f",f,result);
	}
	
	public static void cToc() {
		Scanner sc = new Scanner(System.in);
		System.out.print("섭씨입력 : ");
		int c = sc.nextInt();
		double result = (c - 32) / 1.8;
		System.out.printf("(%d-32) / 1.8 = %.2f",c,result);
	}
}

package ex03_method;

import java.util.Scanner;

public class CalcTestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자 : ");
		String op = sc.next();
		
		CalcTest calc = new CalcTest();
		
		int x = calc.getResult(num1, num2, op);

		System.out.println(x);
	}

}

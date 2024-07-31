package ex03_operator;
import java.util.Scanner;

public class Ex05_Operator {

	public static void main(String[] args) {
		/*
		 논리연산자
		 피연산자를 두개 필요로 하는 연산자
		 논리형 데이터만 사용 가능
		 
		 && -> and ( 하나라도 참이 아닐결우 전부 거짓으로 판정 )
		 || -> or  ( 한쪽만 참이여도 참 )
		 !  -> 부정
		 
		 
		*/
		
		int myage = 30;
		int limit = 35;
		boolean result = (limit-myage) >=5 && ++myage >30;
		
		System.out.println(result);


		int myage2 = 30;
		int limit2 = 35;
		result = (limit2 - myage2) >=5 || myage2 >30;
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("입력한 정수가 짝수인가? " + !(!(num % 2 == 0)));
		System.out.println("입력한 정수가 짝수인가? " + !(num % 2 != 0));
	}

}

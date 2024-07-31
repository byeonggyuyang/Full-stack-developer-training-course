package ex03_operator;

public class Ex04_Operator {

	public static void main(String[] args) {
		int n1 = 10; //n1이라는 int형 변수에 10이라는 정수를 대입함.
		int n2 = 7;
		System.out.println("=연산자: n1 = " + n1 + ", n2 = " + n2);
		
		/*
		 복합대입연산자
		 산술연산자와 대입연산자가 합쳐진 형태
		*/
		
		int x = 10;
		int y = 3;
		
		y += x;
		System.out.printf("%d\n",y);
		
		y *= x;
		System.out.printf("%d\n", y);
		
		y %= x;
		System.out.printf("%d\n", y);
		
		/*
		 비교연산자
		 변수나 상수의 값을 비교하여 참과 거짓 판단
		*/
		
		int a = 10;
		int b = 20;
		boolean result = a>b;
		
		System.out.println(result);
		result = a<=b;
		System.out.println(result);
		result = a==b;
		System.out.println(result);
		result = a!=b;
		System.out.println(result);
		
	}

}

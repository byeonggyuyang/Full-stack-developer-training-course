package ex03_operator;

public class Ex01_Operator {

	public static void main(String[] args) {
		int t = 100;
		int resultPlus = +t; //+부호
		int resultMinus = -t; //-부호
	
		System.out.println(resultPlus);
		System.out.println(resultMinus);
		
		double d = 1.11; //기본값이 +이기 때문에 생략 가능하다.
		double result = -d;
		
		System.out.println(-d);
		System.out.println(result);
		
		boolean isHuman = false;
		System.out.println(!isHuman);//true
		System.out.println(isHuman);//false
		
		int x = 100;
		int y = 200;
		
		System.out.println(x + y);// 100 + 200
		System.out.println(x - y);// 100 - 200
		System.out.println(x * y);// 100 * 200
		System.out.println(x / y);// 100 / 200 정수형의 계산으로 0.5가 아닌 0을 반환
		System.out.println(x % y);// 100 % 200
		
		int result2 = 1000000 * 100000;
		System.out.println(result2);
	}

}

package ex03_operator;

public class Ex07_Operator {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		boolean result;		
		result = ++a >= b ? true : false;
		System.out.println("result :" + result);
				
		int n1 = 10;
		int n2 = 20;
		char result2;
		result2 = (n1 += n1) == n2 ? 'O' : 'X';
		System.out.println("result2 : " + result2);
		//삼항연산의 값을 받을 변수의 자료형과 ?뒤의 결과값의 타입이 같아야 한다.

	}

}

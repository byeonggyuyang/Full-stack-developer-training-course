package ex05_lambda;

public class Ex01_lamda {

	public static void main(String[] args) {
		Calculator cal1 = new CalculatorImpl();
		
		int res = cal1.plus(10, 20);
		System.out.println(res);
		
		
		//익명클래스
		Calculator cal2 = new Calculator() {
			
			@Override
			public int plus(int num1, int num2) {
				
				return num1 + num2;
			}
		};
		res = cal2.plus(20, 30);
		System.out.println(res);
		
		//람다식을 통한 구현
		Calculator cal3 = (num1,num2)->num1 +num2;
		
		res = cal3.plus(10, 20);
		
		System.out.println("cal3 : " + res);
		
		//람다식2 이중콜론
		MyFunction mf = System.out::println;
		mf.method(30);
	}
}

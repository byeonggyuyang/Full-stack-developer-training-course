package ex04_generic;

class Calculator<T extends Number>{
	void add(T a, T b) {};
	void min(T a, T b) {};
	void mul(T a, T b) {};
	void div(T a, T b) {};
}

public class Ex01_Generic {

	public static void main(String[] args) {
		
		//제네릭은 아무 타입이나 모두 할당이 가능하다
		Calculator<Number> cal1 = new Calculator<>();
		
		//Number 타입 사용 가능한 타입 ( byte, double, float, int, long,short )
		/* 사용 불가능
		Calculator<Object> cal2 = new Calculator<>();
		Calculator<String> cal3 = new Calculator<>();
		Calculator<Ex01_Generic> cal4 = new Calculator<>();
		*/
		Calculator<Integer> cal5 = new Calculator<>();
		Calculator<Double> cal6 = new Calculator<>();

	}

}

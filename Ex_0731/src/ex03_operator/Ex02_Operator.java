package ex03_operator;

public class Ex02_Operator {

	public static void main(String[] args) {
		//선행증감
		//1이 먼저 증감되고 코드에 즉시 반영되어 실행
		int a = 10;
		System.out.println("a : " + ++a); //결과 11
				
		//후행증감
		//코드가 먼저 실행되고 1이 증감
		//다음에 다시 사용될 때 증감값을 반영한다.
		int b = 10;
		System.out.println("b : " + b++); //결과 10
		System.out.println("b : " + b);   //결과 11

		int x = 5;
		int y = x++;

		System.out.println("x의 값 : " +x); // x : ?
		System.out.println("y의 값 : " +y); // y : ?
		
		//오버플로우와 언더플로우
		//정수 타입 연산에서 오버플로우 또는 언더플로우가 발생하면
		//실행에러가 발생할 것 같지만 해당 정수 타입의 최소값 또는
		//최대값으로 되돌아간다.
		byte value = 127;
		value++;
		System.out.println(value);

		byte value2 = -128;
		value2--;
		System.out.println(value2);
	}

}

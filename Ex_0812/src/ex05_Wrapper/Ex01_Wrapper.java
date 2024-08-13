package ex05_Wrapper;

public class Ex01_Wrapper {

	public static void main(String[] args) {
		
		//정수형 객체 선언
		Integer num01 = new Integer(10);
		Integer num02 = Integer.valueOf(10);

		
		//실수형 객체 선언
		Double doublenum01 = Double.valueOf(30.11);
		
		//문자형
		Character ch = Character.valueOf('A');
		
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(doublenum01);
		System.out.println(ch);
	}

}

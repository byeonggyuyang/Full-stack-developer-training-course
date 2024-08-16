package ex01_lamda;

interface Interface {
	
	//추상메서드
	abstract void methodA();
	abstract void methodB();
	abstract void methodC();
	
	//1. 메서드 앞에 Default예약어를 붙힌다
	//2. body(구현부)가 존재해야함
	
	default void defaultMethodA() {
		System.out.println("디폴드메서드 A");
	}
}

class InterIml implements Interface{
	
	@Override
	public void methodA() {
		System.out.println("오버라이딩 A");
	}
	
	@Override
	public void methodB() {
		System.out.println("오버라이딩 B");
	}
	
	@Override
	public void methodC() {
		System.out.println("오버라이딩 C");
	}
	
	@Override
	public void defaultMethodA() {
		System.out.println("zzzzzz");
	}
}

public class Ex02_DefaultMethod {
	 public static void main(String[] args) {
		Interface inter = new InterIml();
		inter.methodA();
		inter.defaultMethodA();
	 
	 }
}

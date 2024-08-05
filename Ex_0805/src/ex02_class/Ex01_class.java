package ex02_class;

class A {
	
}
/*
 프로그램을 실행했을 때, 코드 파일을 각각 작성한 것과 동일하게 
 각 class별로 도출되어 2개가 생성된다.
 파일 분리 여부와 상관 없이 결과물이 같기 때문에, 
 분리 여부는 개발자가 원하는 대로 작성해도 무방하다.
 그러나 추후 유지보수의 편리성과 클래스 재사용을 고려해 
 하나의 파일에 한 개의 클래스를 작성하는 것을 추천합니다.
*/

public class Ex01_class {

	public static void main(String[] args) {
		
		
		Cat c;
		
		c = new Cat();
		
		Cat c2 = new Cat();
		
		
		Car car = new Car();
		
		
		
		System.out.println("car의 바퀴수" + car.wheel);
		
		car.wheel = 4;
		
		System.out.println("car의 바퀴수" + car.wheel);
		
		
		Car car2 = new Car();
		
		System.out.println("car2의 바퀴수" + car2.wheel);
	
		car.ride(); 
	}

}

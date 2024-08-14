package ex04_generic;

interface Person{
	
}

//implements -> interface 상속
class Student implements Person{
	
}

class Worker{
	
}

//Person인터페이스를 구현한 클래스만 제네릭타입으로 들어올 수 있음
class School <T extends Person>{
	
}

public class Ex02_Generic {
	public static void main(String[] args) {
		School<Student> sc = new School<Student>();

	}

}

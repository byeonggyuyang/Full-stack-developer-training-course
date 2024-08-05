package ex03_method;

public class JoggerMain {

	public static void main(String[] args) {
		Jogger jogger = new Jogger(); //객체 생성
		jogger.name = "김나비";
		jogger.sayName();
		jogger.run(); //jogger인스턴스의 run()메서드 호출

	}

}

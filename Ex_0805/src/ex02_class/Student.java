package ex02_class;

public class Student {
	static String schoolName = "코리아 고등학교"; //정적 멤버 선언
	String studentName; //인스턴스 필드 선

	static void goToSchool() {
		System.out.println("학교에 갑니다");
		
		
	}
	
	void hello() { //인스턴스 메서드 선언
		System.out.println("안녕하세요, 제 이름은 " + studentName + "입니다.");
	}
}

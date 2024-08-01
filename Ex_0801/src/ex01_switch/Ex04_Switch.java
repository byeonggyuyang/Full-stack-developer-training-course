package ex01_switch;

public class Ex04_Switch {

	public static void main(String[] args) {
		// java12 이상의 switch
		// 조건에 복수의 값을 사용하는것이 가능해짐
		// arrow Function 사용 가능
		
		String day = "MONDAY";
				
		switch(day) {
		case "MONDAY":
		case "TUESDAY":
		case "WENDSDAY":
		case "THURSDAY":
		case "FRIDAY":
			System.out.println("평일");
			break;
		case "SATURDAY":
		case "SUNDAY":
			System.out.println("주말");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		
		//java 12버전 이상에서의 switch문
		switch(day) {
		case "MONDAY", "TUESDAY", "WENDSDAY", "THURSDAY", "FRIDAY" -> System.out.println("평일");
		case "SATURDAY","SUNDAY" ->System.out.println("주말");
		default -> System.out.println("잘못된 입력입니다.");
		}
	}

}

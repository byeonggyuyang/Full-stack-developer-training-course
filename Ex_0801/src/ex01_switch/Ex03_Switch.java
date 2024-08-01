package ex01_switch;

public class Ex03_Switch {

	public static void main(String[] args) {
		/* 
		 조건에 맞는 case를 시작으로 뒤따라오는 모든 case구문이 실행된다. ( 값이 정해져 있는 경우에만 )
		 break가 없다면 무한루프에 걸림 
		*/
		
		int num = 1;
		
		switch (num) {
		case 1:
			System.out.println("num은 1입니다.");
			
		case 7:
			System.out.println("num은 7입니다.");
			
		
		default:
			System.out.println("num은 1과 7이 아닙니다.");
				
		}

	}

}

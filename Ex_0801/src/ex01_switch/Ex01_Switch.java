package ex01_switch;
import java.util.Scanner;

public class Ex01_Switch {

	public static void main(String[] args) {
		
		int num = 7;
		
		switch (num) {
		case 1:
			System.out.println("num은 1입니다.");
			break;
		case 7:
			System.out.println("num은 7입니다.");
			break;
		
		default:
			System.out.println("num은 1과 7이 아닙니다.");
			break;	
		}
		
		
		
		
		
		
		//------------------------------------------------------------------------------//
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 입력 : ");
		int score = sc.nextInt();
		
		switch (score/10) {
		case 10:
		case 9: 
			System.out.println("A");
			break;
		case 8: 
			System.out.println("B");
			break;
		case 7: 
			System.out.println("C");
			break;
		case 6: 
			System.out.println("D");
			break;		
		default: 
			System.out.println("F");
			break;
		}

	}

}

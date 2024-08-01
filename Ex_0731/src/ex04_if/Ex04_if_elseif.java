package ex04_if;
import java.util.Scanner;

public class Ex04_if_elseif {

	public static void main(String[] args) {
		
		int favorite = 7;
		
		if(favorite > 5) 
		{ 
			System.out.println("좋아하는 숫자가 5보다 큽니다");
		}
		else if(favorite == 7) 
		{
			System.out.println("좋아하는 숫자는 7입니다.");
		}
		else 
		{
			System.out.println("좋아하는 숫자는 5보다 작습니다.");
		}
		
		//--------------------------------------------------//
		/*
			20살 이상 성인
			14살 이상이면 청소년
			7살 이상이면 어린이
			그 이외 유아
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요 : ");
		
		int age = sc.nextInt();
				  //객체명.메서드명() -> 해당 클랫그에 있는 메서드 호출
		if(age >= 20)
		{
			System.out.println("성인");
		}
		else if(age >= 14)
		{
			System.out.println("청소년");
		}
		else if(age>=7)
		{
			System.out.println("어린이");
		}
		else 
		{
			System.out.println("유아");
		}
		
		
		//------------------------------------------------------//
		/*
		 100 ~ 90 A
		 89 ~ 80 B
		 79 ~ 70 C
		 69 ~ 60 D
		 59 ~ F
		*/
		
		System.out.print("성적입력 : ");
		
		int num = sc.nextInt();
		
		if(num <= 100 && num >= 90)
		{
			System.out.println("A");
		}
		else if(num >= 80)
		{
			System.out.println("B");
		}
		else if(num >= 70 )
		{
			System.out.println("C");
		}
		else if(num >= 60 )
		{
			System.out.println("D");
		}
		else 
		{
			System.out.println("F");
		}
		
		System.out.print("성적 입력2 : ");
		int num2 = sc.nextInt();
		
		switch (num2/10) {
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

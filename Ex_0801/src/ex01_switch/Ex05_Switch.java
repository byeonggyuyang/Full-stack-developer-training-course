package ex01_switch;
import java.util.Scanner;

public class Ex05_Switch {

	public static void main(String[] args) {
		/*
		 10이하의 숫자를 키보드에서 입력
		 해당 숫자가 짝수인지 홀수인지 판별
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		
		int num = sc.nextInt();
		// 방식 1
		if(num <= 10) {
			switch (num % 2) {
			case 0 : 
				System.out.println("짝수");
				break;
			case 1 : 
				System.out.println("홀수");
				break;
			}
		}
		else 
		{
			System.out.print("10이상의 숫자를 입력하였습니다.\n");
		}
		
		// 방식 2
		if(num <= 10) {
			switch(num) {
			case 1,3,5,7,9 -> System.out.println("홀수");
			case 2,4,6,8,10 -> System.out.println("짝수");
			}
		}
		else 
		{
			System.out.print("10이상의 숫자를 입력하였습니다\n");
		}
		
		
		//----------------------------------------------------------//
		/*
		 키보드에서 달(month)을 입력받아
		 해당 달이 몇일까지 있는지
		 결과값 : x월은 x일까지 있습니다.
		*/
		
		System.out.print("년(year)을 입력해주세요 : ");
		int year = sc.nextInt();
		System.out.print("월(month)을 입력해주세요 : ");
		int month = sc.nextInt();		
		
		switch (month) {
		case 1,3,5,7,8,12 -> System.out.printf("%d년 %d월은 %d일까지 있습니다.\n",year,month,31);
		case 4,6,9,11 -> System.out.printf("%d년 %d월은 %d일까지 있습니다.\n",year,month,30);
		default -> {
				if((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0) 
				{
					System.out.printf("%d년 %d월은 %d일까지 있습니다.\n",year,month,29);
				}
				else 
				{
					System.out.printf("%d년 %d월은 %d일까지 있습니다.\n",year,month,28);
				}
			}
		}
		
		//---------------------------------------------------------------------------//
		/*
		 계산기 프로그램
		 두 개의 정수를 입력받는다
		 산술연산자도 입력받아서 문자열에 담는다
		 switch 사용
		*/
		
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int frontNum = sc.nextInt();
		
		System.out.print("연산자를 입력해주세요 : ");
		String op = sc.next();
		
		System.out.print("마지막 숫자를 입력해주세요 : ");
		int endNum = sc.nextInt();
		
		switch (op) {
		case "+"-> System.out.printf("%d%s%d=%d",frontNum, op, endNum, frontNum + endNum);
		case "-"-> System.out.printf("%d%s%d=%d",frontNum, op, endNum, frontNum - endNum);
		case "*"-> System.out.printf("%d%s%d=%d",frontNum, op, endNum, frontNum * endNum);
		//소수점까지 나오게 할려면 int정수 값을 double로 형 변환 시켜줌
		case "/"-> System.out.printf("%d%s%d=%d",frontNum, op, endNum, frontNum / (double)endNum);
		}
		
	}

}

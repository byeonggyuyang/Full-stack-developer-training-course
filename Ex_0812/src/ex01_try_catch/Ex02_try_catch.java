package ex01_try_catch;

import java.util.Scanner;

public class Ex02_try_catch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		//나이를 입력받고
		//20살 이상이면 성인 14살이상이면 청소년 7살 이상이면 어린이 나머지 유아
		//0이하의 수가 입력되면 input에러 발생시키고 입력 잘못 출력
		try 
		{
			
			System.out.println("당신의 나이를 입력하세요 >> ");
			age = sc.nextInt();
			
			if(age <= 0 )
			{
				throw new InputErrorException("입력 잘못");
			}
			
			if(age >= 20)
			{
				System.out.println("성인");
			}
			else if(age >= 14)
			{
				System.out.println("청소년");
			}
			else if(age >= 7)
			{
				System.out.println("어린이");
			}
			else
			{
				System.out.println("아동입니다");
			}
		}
		catch(InputErrorException e)
		{
			System.out.println(e.getMessage());
		}

	}

}

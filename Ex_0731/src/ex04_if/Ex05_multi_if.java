package ex04_if;

public class Ex05_multi_if {

	public static void main(String[] args) {
		// 중첩 if
		/*
		 10보다 작으면서 홀수인지 판별
		*/
		
		int num = 5;
		
		if(num <10) 
		{
			if(num % 2==0)
			{
				System.out.println("짝수");
			}
			else 
			{
				System.out.println("홀수");
			}
		}

	}

}

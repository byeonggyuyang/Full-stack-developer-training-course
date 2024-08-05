package ex03_method;

public class Calc {
	//두 수를 더하는 sum메서드 만들기
	//두 수의 합은 x입니다 라는 출력문 작성하기
	//CalcMain 만들어서 메서드 호출하기
	
	void sum(int num1, int num2)
	{
		System.out.printf("두 수의 합은 %d입니다",(num1 + num2));
	}
	
	void sum(int[] nums)
	{
		int result = 0;
		for (int i=0;i<nums.length;i++)
		{
			result += nums[i];
		}
		System.out.println("숫자들 합 : " + result);
	}
}

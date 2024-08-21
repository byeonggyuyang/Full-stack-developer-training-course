package ex01_bufferd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex07_sum {

	public static void main(String[] args) throws Exception {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("몇개 숫자 쓸지 : ");
		int num = Integer.parseInt(buffer.readLine());
		
		System.out.print("정수입력 : ");
		String[] num2 = buffer.readLine().split("");
		
		int result = 0;
			
		
		for(int i = 0; i < num; i++)
		{
			result += Integer.parseInt(num2[i]);	
		}
		
		System.out.println(result);

	}

}

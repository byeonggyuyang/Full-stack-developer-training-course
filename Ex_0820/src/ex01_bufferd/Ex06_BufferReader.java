package ex01_bufferd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex06_BufferReader {

	public static void main(String[] args) throws Exception{
		System.out.print("문자열 입력 : ");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		
		String str = buffer.readLine();

		System.out.println("입력된 문자열 : " + str);
		
		//정수입력받기
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(buffer.readLine());
		System.out.println("정수 : " + num );
		
		//공백으로 구분된 정수 입력받기
		System.out.println("여러개 정수 입력 :");
		String [] iArr = buffer.readLine().split(" ");
		System.out.println(Arrays.toString(iArr));
	}

}

package Ex_02;

import java.util.Scanner;

public class MethidMain {

	public static void main(String[] args) {
		int[] arr = {4,1,2,10,7,9,5,6,3,8};
		
		MethodTest.Finder(arr);
		
		
		//온도구하기
		TempMethod t = new TempMethod();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("온도 구하기 숫자 입력 (1 or 2) : ");

		switch(sc.nextInt())
		{
		case 1 -> t.fToc();
		case 2 -> t.cToc();
		}
		
		
	}

}

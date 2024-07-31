package ex01_casting;

import java.io.InterruptedIOException;

public class Ex01_Casting {

	public static void main(String[] args) {
		
		int num = 11;
		double numChange = 3.14;
		
		//정수를 실수형변수에 대입
		numChange = num;
		/*
		 형 변환은 숫자자료형만 가능
		 byte,short,int,long,float,double
		 문자형인 char 역시 정수이기도 하므로 형 변환 가능
		 */
	
		int i = 100;
		char c = 'a'; //아스키코드 a의 값이 97임
		i = c;
		double d = i;
		System.out.println(i);
		System.out.println(d);
	}

}

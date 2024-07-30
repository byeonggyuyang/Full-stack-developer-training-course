package ex02_print;

public class Print03 {

	public static void main(String[] args) {
		//printf()출력문은 값의 타입에 따라서 서식문자를 사용하여 데이터를 출력함
/*
		%d:정수형
		%f:실수형
		%s:문자열
		%c:문자형
		%b:논리형
		
		\n : 줄바꿈
		 
		System.out.printf("출력문 + 서식문자.",서식문자에 들어갈 값);
*/
		System.out.printf("저는 대학교 %d학년에 재학중입니다.\n",3);
				
		System.out.printf("%d은 첫 번째,%f은 두 번째, %s은 세 번째.",1,2.0,"셋");
		System.out.println();
		
		System.out.printf("%05d\n",1);
		System.out.printf("%05d\n",12);
		System.out.printf("%05d\n",123);
		System.out.printf("%05d",1234);
		System.out.println();
		System.out.printf("%05d",12345);
		System.out.println();
		
		//소수점 아래 정수번째 자리까지 출력(반올림)
		System.out.printf("%.1f\n",1.1234567);
		System.out.printf("%.2f\n",1.1234567);
		System.out.printf("%.3f\n",1.1234567);
		System.out.printf("%.4f\n",1.1234567);
		System.out.printf("%.5f\n",1.1234567);
	
	}

}

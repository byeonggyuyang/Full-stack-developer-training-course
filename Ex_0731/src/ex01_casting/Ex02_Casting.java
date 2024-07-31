package ex01_casting;

public class Ex02_Casting {

	public static void main(String[] args) {
		/*
		 강제현변환(Demotion)
		 큰 자교형에서 작은 자료형을 강제로 변환시켜줌
		 (원하는 자료형) 데이터or 변수;
		 */
		
		int i = 10;
		byte b =(byte)i; //byte : -128 ~ 127
				
		System.out.printf("[int -> byte] i의 값 : %d, b의 값 : %d\n",i,b);
		
		int j = 1000;
		byte c = (byte)j; //오버플로우? byte 범위안에 있어야 함 안그러면 값이 이상하게 나옴 
		
		System.out.printf("[int -> byte] j의 값 : %d, c의 값 : %d\n",j,c);
		

	}

}

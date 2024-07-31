package ex01_casting;

public class Ex04_Casting {

	public static void main(String[] args) {
		//실수 -> 정수
		
		//float -> int 강제형변환
		//크기는 같지만 타입이 다르므로 변환해야함
		
		float f1 = 12345.67f;
		int i1 = (int)f1;
		
		System.out.printf("[float -> int] f1의 값 : %.2f, i1의 값 : %d\n",f1,i1);
		
		//double -> int
		
		double d1 = 12345.67;
		int i2 = (int)d1;
		System.out.printf("[double -> int] d1의 값 : %.2f, i2의 값 : %d\n",d1,i2);
		//실수에서 정수로 변환하면 소수점이 사라지기 때문에 값의 변화에 주의해야함.
		
		byte b1 = 100;
		byte b2 = 20;
		/*
		 byte b3 = b1 + b2; -> byte끼리의 연산은 127이 넘어가는 경우가 많아서
		 byte끼리의 연산은 int로 형변환 해줌
		*/
		byte b3 = (byte)(b1 + b2);
		int i = b1 + b2;
		System.out.printf("[byte 연산 방법1] b3의 값 : %d\n",b3);
		System.out.printf("[byte 연산 방법2] i의 값 : %d",i);
	}

}

package ex01_casting;

public class Ex03_Casting {

	public static void main(String[] args) {
		
		//double -> float 강제 형변환 (범위 값)
		double d1 = 1.1234;
		float f1 = (float)d1;
		System.out.printf("[double -> float] d1의 값 : %f, f1의 값 : %f\n",d1,f1);
	
		//double -> float (float 최소값보다 작은 값)
		//지수가 들어가면 %e 써야함
		double d2 = 1.0e-50;
		float f2 = (float)d2;	
		System.out.println("[double -> float] d2의 값 :"+d2+" , f2의 값 : " + f2);
		System.out.printf("[double -> float] d2의 값 : %e, f2의 값 : %f\n",d2,f2);
		
		//double -> float (float 최대값보다 큰 값이면 Infinity가 된다.)
		double d3 = 1.0e100;
		float f3 = (float)d3;
		System.out.printf("[double -> float] d3의 값 : %e, f3의 값 : %f\n",d3,f3);
		
		//double -> float (정밀도 차이)
		double d4 = 9.123456789;
		float f4 = (float)d4;
		System.out.println("[정밀도차이] d4의 값 : "+d4+", f4의 값 : " + f4);
		System.out.printf("[정밀도차이] d4의 값 : %.9f, f4의 값 : %f",d4,f4);
	}

}

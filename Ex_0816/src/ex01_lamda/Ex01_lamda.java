package ex01_lamda;

interface Iminus{
	int minus(int x, int y);
}


public class Ex01_lamda {
	public static void main(String[] args) {
		//람다식을 반환값에 넣는다
		Iminus im = makeFunction();
		
		int res = im.minus(10, 5);
		
		System.out.println(res);
		
	}
	
	public static Iminus makeFunction() {
		return (x,y) -> x-y;
	}

}

package ex03_variable;

public class Ex_Variable02 {

	public static void main(String[] args) {
		boolean b = true;
		System.out.println(b);
		
		b = false;
		System.out.println(b);
		
		char ch = 'A'; //문자형은 홑따옴표 안에 넣어야 하며 한글자이상 넣을 수 없다.
		System.out.println("ch = " + ch); //결과 : A

		char ch3 = 35; //아스키코드 65에 + 1
		System.out.println("ch3 = " + ch3); //결과 : B
		
		byte b1 = 127;
		short s = 32767;
		int n = 550;

		System.out.println("b1 = " + b1); //결과 127
		System.out.println("s = " + s); //결과 32767
		System.out.println("n = " + n); //결과 550
		
		float f1, f2;
		f1 = 3.14f;
		f2 = 150f;

		System.out.println("f1 = " + f1); //결과 3.14 
		System.out.println("f2 = " + f2); //결과 150.0
		
		int myAge = 20; //myAge에 20을 저장
		int yourAge = myAge+1;
		System.out.println("myAge : " + myAge);
		System.out.println("yourAge : " + yourAge);
		
		int su1 = 20;
		int su2 = 30;

		System.out.println("변경전");
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);

		//컵 두개에 들어있는 내용물을 서로 교환한다고 생각을 해보자.
		//컵 두개로는 서로 바꾸는게 불가능하다.
		//내용물을 임시로 담아놓을 컵이 하나 필요하다.
		int temp;
		temp = su1;
		su1 = su2;
		su2 = temp;

		System.out.println("변경후");
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
	}

}

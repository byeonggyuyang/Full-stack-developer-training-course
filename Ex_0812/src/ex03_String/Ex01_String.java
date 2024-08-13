package ex03_String;

public class Ex01_String {

	public static void main(String[] args) {
		String str = "Kim Mal Ddong";
		
		//length() 13
		System.out.println("str 길이" + str.length()); 

		//indexOf(char ch) 5 
		//특정문자(열) 위치
		System.out.println("a의 위치" + str.indexOf('a'));
		
		//indexOf(String str) 4
		System.out.println("Mal의 위치" + str.indexOf("Mal"));
		
		//lastIndexOf(char ch) 11
		System.out.println("마지막 문자 n의 위치" + str.lastIndexOf('n'));
		
		//charAt() M
		System.out.println("추출 문자" + str.charAt(4));
		
		//subString(int start, int end) Kim
		System.out.println(str.substring(0, str.indexOf('M')));
		
		//split();
		System.out.println(str.split(" ").toString());
		
		
		
		
		
		
		
		
		
		
		
	}

}

package ex03_method;

public class MidTertmMain {

	public static void main(String[] args) {
		midTerm term = new midTerm();
		
		int[] numA = {90,91};
		int[] numB = {92,93};
		
		int sumA = term.score(numA);
		int sumB = term.score(numB);
		
		if(sumA > sumB) {
			System.out.println("A가 더 큼");
		}
		else {
			System.out.println("B가 더 큼");
		}
	}

}

package ex03_method;

public class MethodTestMain {

	public static void main(String[] args) {
		int[] nums = {1,3,5,7,9,12};
		
		MethodTest mtt = new MethodTest();
		
		int max = mtt.maxFinder(nums);
		
		System.out.println(max);

	}

}

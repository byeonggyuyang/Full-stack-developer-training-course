package ex03_method;

import java.util.function.IntPredicate;

public class CalcMain {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		calc.sum(10, 20);
		
		int[] nums = {100,200};
		calc.sum(nums);
	}

}

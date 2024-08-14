package ex04_generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04_Generic {

	public static void main(String[] args) {
		List<? extends Object> list = new ArrayList<String>();

		List<? super String> list2 = new ArrayList<Object>();
		List<Integer> lists = new ArrayList<>(Arrays.asList(1, 2, 3));
	    print(lists); // OK
	}

	public static void print(List<? extends Number> list) {
	    for (Object e : list) {
	        System.out.println(e);
	    }
	}

}

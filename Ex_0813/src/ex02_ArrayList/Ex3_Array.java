package ex02_ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex3_Array {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		
		ArrayList<String> arrName = new ArrayList<String>();
		ArrayList<Integer> arrAge = new ArrayList<Integer>();
		
		arrName.add("홍길동");
		arrAge.add(20);	arrName.add("이순신");
		arrAge.add(20);	arrName.add("강감찬");
		arrAge.add(20);
		arrName.add("을지문덕");
		arrAge.add(20);
		arrName.add("연개소문");
		arrAge.add(20);
		System.out.println(arrName);
		System.out.println(arrAge);
		System.out.println("---------------------");

	}

}

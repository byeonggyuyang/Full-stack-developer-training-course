package ex02_ArrayList;

import java.util.ArrayList;

public class Ex4_Array {

	public static void main(String[] args) {
		ArrayList<Ex4_ArrayFriend> list = new ArrayList<Ex4_ArrayFriend>();
		
		
		Ex4_ArrayFriend f1 = new Ex4_ArrayFriend();
		f1.name = "홍";
		f1.age = 20;
		f1.bt = 'A';
		
		Ex4_ArrayFriend f2 = new Ex4_ArrayFriend();
		f2.name = "김";
		f2.age = 25;
		f2.bt = 'B';
		
		list.add(f1);
		list.add(f2);

//		System.out.println(list.get(0).name);
//		System.out.println(list.get(0).age);
//		System.out.println(list.get(0).bt);
//		
//		System.out.println(list.get(1).name);
//		System.out.println(list.get(1).age);
//		System.out.println(list.get(1).bt);
		
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i).name);
			System.out.println(list.get(i).age);
			System.out.println(list.get(i).bt);
		}
		System.out.println("-----------------------------------");
		
	}

}

package ex03_generic;

import java.util.ArrayList;
import java.util.List;

class Fruit{}
class Apple extends Fruit{}
class Banana extends Fruit{}
class FruitBox<T>{
	List<T> fruits;
	
	public void add(T fruit) {
		fruits.add(fruit);
	}
}


public class Ex02_Generic {

	public static void main(String[] args) {
		FruitBox<Fruit> box = new FruitBox<>();
		box.fruits = new ArrayList<>();
		
		//다형성의 원리가 그대로 적용
		box.add(new Fruit());
		box.add(new Apple());
		box.add(new Banana());
		
		System.out.println(box);
	}

}

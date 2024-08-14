package ex04_generic;

import java.util.ArrayList;
import java.util.List;

interface Readable{}
interface Closeable{}

class BoxType implements Readable, Closeable{};
class Box<T extends Readable & Closeable>{
	List<T> list = new ArrayList<>();
	
	public void add(T item) {
		list.add(item);
	}
}

public class Ex03_Generic {

	public static void main(String[] args) {
		//Readable, Closeable동시에 구현한 클래스만이 타입할당이 가능함
		//최상위 Object도 불가능
		Box<BoxType> box = new Box<>();

	}

}

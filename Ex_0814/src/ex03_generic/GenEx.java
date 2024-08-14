package ex03_generic;

public class GenEx<T> {

	//필드의 타입을 미리 결정하지 않는다.
	T value;
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
		
	}
}

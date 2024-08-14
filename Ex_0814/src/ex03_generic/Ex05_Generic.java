package ex03_generic;

interface ISample<T>{
	public void addElement(T t, int index);
	public T getElement(int index);
}

class Sample<T> implements ISample<T> {
    private T[] array;

    public Sample() {
        array = (T[]) new Object[10];
    }

    @Override
    public void addElement(T element, int index) {
        array[index] = element;
    }

    @Override
    public T getElement(int index) {
        return array[index];
    }
}

public class Ex05_Generic {

	public static void main(String[] args) {
		Sample<String> sample = new Sample<>();
		sample.addElement("This is string", 5);
		
		System.out.println(sample.getElement(5));

	}

}

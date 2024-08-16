package ex02_Thread;

class whiteFlag implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println("백기 올");
		}
	}
	
}

public class RunnableExample {
	public static void main(String[] args) {
		whiteFlag wf = new whiteFlag();
		
		Thread t = new Thread();
		t.start();
		
		//Runnable 인터페이스를 익명클래스로 만들어서 람다식으로 표현
		Runnable blue = () ->{
			while(true) {
				System.out.println("청기올려");
			}
		};
		
		Thread t2 = new Thread(blue);
		t2.start();
	}
}

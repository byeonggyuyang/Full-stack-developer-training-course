package ex02_Thread;

public class RunnableName {

	public static void main(String[] args) {
		Runnable task = () ->{
			
		};

		
		Thread myThread = new Thread(task); 
		String name = myThread.getName();

		System.out.println(name);
		
		myThread.start();
	}

}

package ex02_Thread;

public class MyThread extends Thread{

	public MyThread() {
		setName("myThread -1");
	}
	
	
	@Override
	public void run() {
		int sum = 0;
		for(int i = 0; i< 10; i++) {
			sum += i;          
		}
		System.out.println(sum);
		
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName);
	}
}

package ex02_Thread;

import java.util.Scanner;


class ThreadCount extends Thread{
	private int n;
	
	public ThreadCount(int n) {
		this.n = n;
	}
	
	@Override
	public void run() {
		for(int i = n; i >= 0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} 
			catch (Exception e)
			{

			} 
		}
		System.out.println("종료");
		
	}
}

public class ThreadCountMain {
	public static void main(String[] args) {
		System.out.print("값을 입력 : ");
		Scanner scan = new Scanner(System.in);

		ThreadCount t = new ThreadCount(scan.nextInt());
		Thread tt = new Thread(t);		
		tt.start();
	}
}

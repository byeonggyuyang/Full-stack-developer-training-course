package ex02_Thread;

public class Storage {
	private int stackCount = 10;
	
	public synchronized void addStack(int stackCount) {
		this.stackCount += stackCount;
		
		if(this.stackCount >= 10) {
			System.out.println("===스레드 깨우기===");
			notify();//wait을 만나 대기상태에 빠진 스레드는 notify를 만나 재구동된다
		}
	}
	public synchronized void popStack(int leaveCount) {
	
		try {
			if(leaveCount > this.stackCount) {
				this.stackCount = 0;
			}
			else {
				this.stackCount -= leaveCount;
			}
			
			if(this.stackCount == 0) {
				System.out.println("===짐 없음 대기===");
				wait();//스레드가 진행중에 wait만나면 정지됨
				System.out.println("===짐 없음 완료===");
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public int getStackCount() {
		return stackCount;
	}
	

}

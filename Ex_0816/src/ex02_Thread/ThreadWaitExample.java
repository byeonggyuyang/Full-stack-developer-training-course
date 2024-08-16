package ex02_Thread;

class AddStackThread extends Thread{
	private Storage stroage;
	public AddStackThread(Storage storage) {
		this.stroage = storage;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000);
				if(this.stroage.getStackCount() == 0) {
					System.out.println("짐 10개 추기");
					this.stroage.addStack(10);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
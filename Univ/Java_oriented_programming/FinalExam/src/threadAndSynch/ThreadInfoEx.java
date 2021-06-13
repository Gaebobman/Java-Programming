package threadAndSynch;


class MThread extends Thread{
	public void run() {
		for(int i = 0 ; i <10;i++) {
			System.out.println(""+i);
			try {sleep(10);}catch(InterruptedException e) {}
		}
	}
}
public class ThreadInfoEx {

	public static void main(String[] args) throws InterruptedException {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		System.out.println("���� ������ �̸� = " + name);
		System.out.println("���� ������ ID = " + id);
		System.out.println("���� ������ �켱���� �� = " + priority);
		System.out.println("���� ������ ���� = " + s);
		
		MThread thread1 = new MThread();
		while(true) {
			Thread.State state = thread1.getState();
			System.out.println(state);
			if(state == Thread.State.NEW) {
				thread1.start();
				System.out.println("���� ������ �̸� = " + thread1.getId());
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			Thread.sleep(5);
		}
		
		
	}

}

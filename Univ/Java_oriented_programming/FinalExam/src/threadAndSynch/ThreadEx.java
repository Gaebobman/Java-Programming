package threadAndSynch;

class MyThread extends Thread{
	public void run() {
		System.out.println(getName());
		for(int i = 0 ; i <1000; i++) {
			System.out.print("+");
		}
	}
}

class MyRunnable implements Runnable{
	
	public void run() {
		for(int i = 0 ; i <1000; i++) {
			System.out.print("-");
		}

	}
	
}

public class ThreadEx {

	public static void main(String[] args) throws InterruptedException {
		MyThread thread1 = new MyThread();
		thread1.start();
		
		Thread thread2 = new Thread(new MyRunnable());
		thread2.start();

		thread1.join();
		thread2.join(); // main ������(ȣ���� �������) thread1, thread2 �� ���⶧���� ��ٸ�

		System.out.println(Thread.currentThread().getName() + "terminated");
		
	}

}

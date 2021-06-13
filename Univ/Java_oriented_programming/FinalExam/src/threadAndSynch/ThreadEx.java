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
		thread2.join(); // main 스레드(호출한 스레드는) thread1, thread2 가 멈출때까지 기다림

		System.out.println(Thread.currentThread().getName() + "terminated");
		
	}

}

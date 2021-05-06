package threadTest;
class MyThread extends Thread{
	@Override
	public void run() { //반드시 있어야 함
		System.out.println(getName());
		for(int i =0 ; i < 1000;i++) {
			System.out.print("+");
			try {
				sleep(1);	//timeout 또는 강제로 깨워질 경우대비 try catch
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
//Runnable 이용 방법

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i =0 ; i < 1000;i++) {
			System.out.print("-");
			try {
				Thread.sleep(1);	//Static Method 호출 (호출한 쓰레드가 sleep 한다);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		long sx = System.currentTimeMillis();
		MyThread thread1 = new MyThread();
		thread1.setName("A");
		thread1.start();

		Thread thread2 = new Thread(new MyRunnable());
		thread2.setName("B");
		thread2.start();
		
		thread1.join();
		thread2.join();
		long ex = System.currentTimeMillis();
		System.out.println(ex-sx +"ms" );
		//
		System.out.print(Thread.currentThread().getName()+"terminated");
	}

}

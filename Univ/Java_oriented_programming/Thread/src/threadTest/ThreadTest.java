package threadTest;
class MyThread extends Thread{
	@Override
	public void run() { //�ݵ�� �־�� ��
		System.out.println(getName());
		for(int i =0 ; i < 1000;i++) {
			System.out.print("+");
			try {
				sleep(1);	//timeout �Ǵ� ������ ������ ����� try catch
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
//Runnable �̿� ���

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i =0 ; i < 1000;i++) {
			System.out.print("-");
			try {
				Thread.sleep(1);	//Static Method ȣ�� (ȣ���� �����尡 sleep �Ѵ�);
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

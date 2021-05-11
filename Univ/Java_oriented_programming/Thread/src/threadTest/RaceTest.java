package threadTest;

import java.util.concurrent.Semaphore;

class Counter{
	int value=0;
	//Semaphore s = new Semaphore(1);	//binary semaphore
	public synchronized void increment() {
//		try {
//			s.acquire();//lock을 얻었다.
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		if(value == 1000)
			try {
				wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		value++;	//Read Modify Write
		notify();
		
		//s.release();//다 사용후
	}
	public synchronized void decrement() {
//		try {
//			s.acquire();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		if(value == 0)
			try {
				wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		value--;
		notify();
//		s.release();
	}
	public void printCounter() {
		System.out.println(value); 

		

	}
}

class IncrementThread extends Thread{
	Counter sharedCounter;
	public IncrementThread(Counter c) {
		this.sharedCounter =c;
	}
	
	public void run() {
		for(int i = 0 ; i < 100000;i++) {
			sharedCounter.increment();
			if(i%10000==0)
			sharedCounter.printCounter();
		}
	}
}
class DecrementThread extends Thread{
	Counter sharedCounter;
	public DecrementThread(Counter c) {
		this.sharedCounter =c;
	}
	
	public void run() {
		for(int i = 0 ; i < 100000;i++) {
			sharedCounter.decrement();
		}
	}
}
public class RaceTest {

	public static void main(String[] args) {
		Counter counter = new Counter();
		IncrementThread thread1 = new IncrementThread(counter);
		thread1.start();

		DecrementThread thread2 = new DecrementThread(counter);
		thread2.start();
		counter.printCounter();
	}

}

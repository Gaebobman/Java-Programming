package threadAndSynch;

import java.util.concurrent.Semaphore;

class Counter {
	Semaphore lock = new Semaphore(1);
	public int value = 0;	
	public synchronized void increment() {
		try {lock.acquire();}catch(InterruptedException e) {}
		value++;		
		lock.release();
	};
	public synchronized void decrement() {
		try {lock.acquire();}catch(InterruptedException e) {}
		value--;
		lock.release();
	};
	public void printCounter() { 
		System.out.println(value); 
	}
}  
class IncrementThread extends Thread{
	Counter sharedCounter;
	public IncrementThread(Counter c) {
	this.sharedCounter = c;
	}
	public void run() {
		for(int i = 0; i < 100000; i++) {
			sharedCounter.increment();
			if(i%10000 == 0)
				sharedCounter.printCounter();
		}
	}
}
class DecrementThread extends Thread{
	Counter sharedCounter;
	public DecrementThread(Counter c) {
	this.sharedCounter = c;
	}
	public void run() {
		for(int i = 0; i < 100000; i++) {
			sharedCounter.decrement();
		}
	}
}

public class RaceConditionEx {

	public static void main(String[] args) throws InterruptedException{
		Counter counter = new Counter();
		IncrementThread thread1 = new IncrementThread(counter);
		thread1.start();
		
		DecrementThread thread2 = new DecrementThread(counter);
		thread2.start();
		
		thread1.join();
		thread2.join();
		counter.printCounter();

	}

}



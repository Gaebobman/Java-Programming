package threadAndSynch;

class Counter2{
	public int value = 0;
	public synchronized void increment() {
		while(value == 1000) {
			try{wait();}catch(InterruptedException e) {}	
		}
		value++;
		notify();
	}
	
	public synchronized void decrement() {
		while(value == 0) {
			try{wait();}catch(InterruptedException e) {}			
		}
		value--;
		notify();
	}
	public void printCounter() { System.out.println(value); }

}

class IncrementThread2 extends Thread{
	Counter2 sharedCounter;
	
	public IncrementThread2(Counter2 counter) {
		this.sharedCounter = counter;
	}
	
	public void run() {
		for(int i = 0 ; i < 100000; i++) {
			sharedCounter.increment();
			if(i %10000 ==0)
				sharedCounter.printCounter();
		}
	}
}
class DecrementThread2 extends Thread{
	Counter2 sharedCounter;
	
	public DecrementThread2(Counter2 counter) {
		this.sharedCounter = counter;
	}
	
	public void run() {
		for(int i = 0 ; i < 100000; i++) {
			sharedCounter.decrement();
			if(i % 10000 ==0)
				sharedCounter.printCounter();
		}
	}
}

public class SynchWaitNotify {

	public static void main(String[] args) throws InterruptedException{
		Counter2 counter = new Counter2();
		IncrementThread2 thread1 = new IncrementThread2(counter);
		thread1.start();
		
		DecrementThread2 thread2 = new DecrementThread2(counter);
		thread2.start();
		
		IncrementThread2 thread3 = new IncrementThread2(counter);
		thread3.start();
		
		DecrementThread2 thread4 = new DecrementThread2(counter);
		thread4.start();
		
		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();
		
		counter.printCounter();


	}

}

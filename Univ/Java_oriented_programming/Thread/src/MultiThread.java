class Counter {
	public int value = 0;	
	public synchronized void increment() {
		 while(value == 1000) {			
			try { wait();} catch (InterruptedException e) {}
		}
		value++;		
        notify();		
	};
	public synchronized void decrement() {
     while(value == 0) {			
			try { wait();} catch (InterruptedException e) {}
		}
		value--;		
        notify();	
	};
	public void printCounter() { System.out.println(value); }
}  
class IncrementThread extends Thread{
	Counter sharedCounter;
	public IncrementThread(Counter c) {
	this.sharedCounter = c;
	}
	public void run() {
		for(int i = 0; i < 100000; i++) {
			sharedCounter.increment();
			if(i%10000 == 0) sharedCounter.printCounter();
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
public class MultiThread {
	public static void main(String[] args) throws InterruptedException  {
		Counter counter = new Counter();
		IncrementThread thread1 = new IncrementThread(counter);
		thread1.start();
		
		DecrementThread thread2 = new DecrementThread(counter);
		thread2.start();
		IncrementThread thread3 = new IncrementThread(counter);
		thread3.start();
		
		DecrementThread thread4 = new DecrementThread(counter);
		thread4.start();
		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();
		counter.printCounter();
	}
}


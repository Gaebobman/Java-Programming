package threadAndSynch;

import java.util.Scanner;

class MyThread1 extends Thread{
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.print("+");
			Scanner sc = new Scanner(System.in);
			sc.next();	
		}
	}
}

class MyRunnable1 implements Runnable {		
	public void run() {
		for(int i = 0; i < 1000; i++) {			
			System.out.print("-");		
		}
	}
}

public class ThreadModel {

	public static void main(String[] args) throws InterruptedException {
		long sx = System.currentTimeMillis();
		MyThread1 thread1 = new MyThread1();			
		thread1.start();
		 
		MyRunnable1 runable = new MyRunnable1();
		Thread thread2 = new Thread(runable);
		thread2.start();
		
		thread1.join();
		thread2.join();
		long ex = System.currentTimeMillis();
		System.out.println(ex - sx+"ms");


	}

}

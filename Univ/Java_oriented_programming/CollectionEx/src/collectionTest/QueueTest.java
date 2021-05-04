package collectionTest;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList <Integer>();
		for (int i = 0; i < 6; i++) {			
			int random = (int) (Math.random()*100)%36 + 1;		
			while(queue.contains(random) == true) {
				random = (int) (Math.random()*100%36) + 1;
			}
			queue.offer(random); 
		}
		System.out.println(queue);
		System.out.println(queue.peek());
		while (!queue.isEmpty()) {
			System.out.print(queue.poll()+" ");
//			Thread.sleep(1000); // 현재의 스레드를 1초간 재운다.
		}


	}

}

package threadAndSynch;

import javax.swing.*;
import java.util.*;

class TimerThread extends Thread{
	public void run() {
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		frame.setTitle("My Timer");
		frame.add(label);
		frame.setSize(300,100);
		frame.setVisible(true);
		
		for(int i = 0 ; i < 10; i++) {
			
			try {
				label.setText("" + i);
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class MyTimer {

	public static void main(String[] args) {
		TimerThread thread = new TimerThread();
		thread.start();
	}

}

import javax.swing.*;

class MyTimer extends Thread{	
	long currentMillis = 0;
	public void run() {
		currentMillis = System.currentTimeMillis();
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		frame.setTitle("My Timer");
		frame.add(label);
		frame.setSize(300, 100);		
		frame.setVisible(true);
		while(true) {
		       long lap = System.currentTimeMillis() - currentMillis;       
		       long ms, sec, min;       
		        String ms_s, sec_s, min_s;			
	        ms = lap % 1000;
	        ms_s = String.format("%03d", ms);      
	        sec = lap / 1000 % 60;
	        sec_s = String.format("%02d", sec);
	        min = lap /1000 /60 % 60;
	        min_s = "" + min;
	        if(sec < 10)
	        	sec_s = "0" + sec;
			
	        label.setText(min_s + ":" + sec_s + ":" + ms_s);
		}
  }		


}

public class TimerEx {

	public static void main(String[] args) {
		MyTimer timer = new MyTimer();
		timer.start();		
	}

}
import java.awt.*;
import java.util.Calendar;

import javax.swing.*;


class MyFrame3 extends JFrame{
	MyFrame3(){
		
		setLocation(2500,200);
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Calendar cal = Calendar.getInstance();		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);				
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		
		Container c = getContentPane();
//		c.setLayout(new FlowLayout(FlowLayout.LEFT,10,20)); //x축 마진, y축 마진
		c.setLayout(new BorderLayout());
		
		
		ImageIcon icon = new ImageIcon("img/Inha.png");
		JLabel imgLabel = new JLabel(icon);
		c.add(imgLabel);	
		
		JLabel label1 = new JLabel("날짜:");
		JLabel label2 = new JLabel("시간:");

		JTextField tf1 = new JTextField("--");
		tf1.setEditable(false);
		tf1.setText(""+ year + "-" + month + "-" + day);

		JTextField tf2 = new JTextField("++");
		tf2.setEditable(false);
		tf2.setText(""+ hour + ":" + minute);

		c.add(imgLabel,BorderLayout.NORTH);
		c.add(label1, BorderLayout.WEST);
		c.add(tf1, BorderLayout.CENTER);		
		c.add(label2, BorderLayout.EAST);		
		c.add(tf2, BorderLayout.SOUTH);	
		
		setVisible(true);	
	}
}


public class FrameCalanderEX {
	public static void main(String[] args) {
		MyFrame3 frame = new MyFrame3();
	}

}



package swingEx;

import java.awt.*;

import javax.swing.*;

class MyFrame1 extends JFrame{
	JButton ok = new JButton("ok");
	JButton cancel = new JButton("cancel");
	JButton ignore = new JButton("ignore");
	
	MyFrame1(){
		setSize(400,200);
		setTitle("Java Programming 2021");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.yellow);
		c.setLayout(new FlowLayout());
		c.add(ok);
		c.add(cancel);
		c.add(ignore);
		
		
		
		
		
		setVisible(true);
	}
}

public class FrameExPage20 {

	public static void main(String[] args) {
		MyFrame1 f = new MyFrame1();	
	}

}

package swingEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame2 extends JFrame{
	JButton ok = new JButton("ok");
	JButton cancel = new JButton("cancel");
	JButton ignore = new JButton("ignore");
	
	MyFrame2(){
		setSize(400,200);
		setTitle("Java Programming 2021");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.yellow);
		c.setLayout(new FlowLayout());
		c.add(ok);
		c.add(cancel);
		c.add(ignore);
		
		JPanel p = new JPanel();
		p.add(ok);
		setContentPane(p); // ContentPane¿Ã πŸ≤Ô¥Ÿ
		
		setVisible(true);
	}
}
public class FrameExPage22 {
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();	
	}
}

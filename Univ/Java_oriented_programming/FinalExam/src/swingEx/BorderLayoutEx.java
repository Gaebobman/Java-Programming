package swingEx;

import java.awt.*;
import javax.swing.*;

class BorderLayoutFrame extends JFrame{
	BorderLayoutFrame(){
		setBounds(300,300,300,200);
		setTitle("보더레이아웃");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
	
		c.setLayout(new BorderLayout(30, 20));
		
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("div"), BorderLayout.WEST);
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		
		
		setVisible(true);
	}
}

public class BorderLayoutEx {

	public static void main(String[] args) {
		BorderLayoutFrame frame = new BorderLayoutFrame ();
	}

}

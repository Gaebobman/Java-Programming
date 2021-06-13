package swingEx;

import java.awt.*;

import javax.swing.*;

class FlowLayoutFrame extends JFrame{
	public FlowLayoutFrame() {
		setBounds(300, 200, 300, 300);
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		
		setVisible(true);
	}
}



public class FlowLayoutEx {

	public static void main(String[] args) {
		FlowLayoutFrame frame = new FlowLayoutFrame();
		
	}

}

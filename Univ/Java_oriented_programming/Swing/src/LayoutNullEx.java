import java.awt.Container;

import javax.swing.*;

class MyFrame5 extends JFrame {
	MyFrame5(){
		setSize(300, 300);
		setTitle("My first Frame");
		setLocation(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i = 0; i < 100 ; i ++) {
			JLabel label = new JLabel(i+"");
			label.setBounds(i*12, i*12, 50, 20);
			c.add(label);
		}
		setVisible(true);				
	}
}
public class LayoutNullEx {

	public static void main(String[] args) {
		JFrame frame = new MyFrame5();

	}

}

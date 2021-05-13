import java.awt.*;
import javax.swing.*;

class MyFrame1 extends JFrame{
MyFrame1(){
		
		setLocation(2500,200);
		setSize(400,200);
		setTitle("My First Frame!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("Password1"));
		c.add(new JLabel("Password2"));
		c.add(new JLabel("Password3"));
		c.add(new JLabel("Password4"));
		c.setBackground(Color.blue);
		setVisible(true);
	}
}


public class GUITest1 {

	public static void main(String[] args) {
		MyFrame1 frame = new MyFrame1();

	}

}

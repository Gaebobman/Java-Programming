import java.awt.*;
import javax.swing.*;


class MyFrame2 extends JFrame{
MyFrame2(){
		
		setLocation(2500,200);
		setSize(400,200);
		setTitle("My First Frame!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel();
		label.setText("학번:");
		label.setForeground(Color.blue);
		label.setOpaque(true);//이래야 보임.
		label.setBackground(Color.yellow);
		c.add(label);
		
		ImageIcon icon = new ImageIcon("img/Inha.png");
		JLabel imgLabel = new JLabel(icon);
		c.add(imgLabel);	
		
		JTextField tf = new JTextField("12344566");
		tf.setEditable(false);
		c.add(tf);
		
		
		setVisible(true);	
	}
}


public class JLabelEX {
	public static void main(String[] args) {
		MyFrame2 frame = new MyFrame2();
	}

}



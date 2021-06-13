package eventEx;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class TAreaFrame extends JFrame {	
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(5, 20);
   JLabel la = new JLabel("입력 후 <Enter> 키를 입력하세요");
   TAreaFrame(){		
		setBounds(300, 100, 300, 300);	
		setTitle("Event Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());		
		c.add(la);
		c.add(tf);		
		c.add(new JScrollPane(ta));		
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText() + "\n");
				
			}
		});
   }
}


public class EventExSecond {

	public static void main(String[] args) {
		TAreaFrame f = new TAreaFrame();

	}

}

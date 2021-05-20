package lab;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class UnitChangeFrame extends JFrame{
	
	private final double KMS_PER_MILE = 1.609;
	
	JLabel label = new JLabel("mile");
	JTextField tf = new JTextField(5);
	JButton btn = new JButton("Convert");
	JLabel labelResult = new JLabel("Result: ");
	
	UnitChangeFrame(){
		setBounds(100, 100, 500, 500);	
		setTitle("Lab3-단위환산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container c = getContentPane();
		JPanel p = new JPanel();
		p.setSize(500,50);
		p.setBackground(Color.yellow);
		p.add(label);
		p.add(tf);
		p.add(btn);
		
		c.add(p,BorderLayout.NORTH);
		c.add(labelResult);
		pack();
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = tf.getText();
				double mile;
				try {
					mile = Double.parseDouble(input);
				} catch (NumberFormatException e2) {
					return;
				}
				double kms = mile * KMS_PER_MILE;
				labelResult.setText(""+kms);
				
				
			}
		});

	}
	
	
}




public class UnitChanger {

	public static void main(String[] args) {
		UnitChangeFrame f= new UnitChangeFrame();
	}

}

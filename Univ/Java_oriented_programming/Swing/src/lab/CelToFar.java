package lab;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class CelToFarFrame extends JFrame{
	
	private final double KMS_PER_MILE = 1.609;
	
	JLabel label1 = new JLabel("섭씨");
	JTextField tf1= new JTextField(5);
	JLabel label2 = new JLabel("화씨");
	JTextField tf2= new JTextField(5);
	
	
	JButton btn1 = new JButton("C->F");
	JButton btn2 = new JButton("F->C");
	JButton btn3 = new JButton("Reset");

	
	 CelToFarFrame(){
		setBounds(100, 100, 500, 500);	
		setTitle("Lab4-온도 변환기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container c = getContentPane();
		JPanel p1 = new JPanel();
		p1.setSize(500,50);
		p1.setBackground(Color.yellow);
		p1.add(label1);
		p1.add(tf1);
		p1.add(label2);
		p1.add(tf2);
		c.add(p1,BorderLayout.NORTH);
		
		JPanel p2 = new JPanel();
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		c.add(p2);
		pack();
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = tf1.getText();
				double cel;
				try {
					cel = Double.parseDouble(input);
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "입력 에러", "경고창", 
							JOptionPane.WARNING_MESSAGE);
					return;
				}
				double far = cel * 1.8 + 32.0;
				tf2.setText(""+far);				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = tf2.getText();
				double far;
				try {
					far = Double.parseDouble(input);
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "입력 에러", "경고창", 
							JOptionPane.WARNING_MESSAGE);

					return;
				}
				double cel = (far- 32.0) *0.55;
				tf1.setText(""+ cel);		
		
						
			}
		});

		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");	
				tf2.setText("");				
			}
		});

	}	
	
}

public class CelToFar {

	public static void main(String[] args) {
		 CelToFarFrame frame = new  CelToFarFrame();

	}

}

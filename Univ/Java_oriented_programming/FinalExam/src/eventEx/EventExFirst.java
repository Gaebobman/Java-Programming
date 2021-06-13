package eventEx;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

class MyListener implements ActionListener{
	int i;

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText("ī��Ʈ: " + i++);
		
	}
}

class EventFrame extends JFrame{
	JButton button = new JButton("ī��Ʈ+");
	JLabel label = new JLabel("ȫ�浿",  SwingConstants.CENTER);
	EventFrame(){
		setBounds(300, 100, 300, 200);	
		setTitle("Event Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().add(button, BorderLayout.WEST);
		getContentPane().add(label, BorderLayout.CENTER);
		
		//button.addActionListener(new MyListener());
		button.addActionListener(new ActionListener() {
			int i;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton)e.getSource();
				button.setText("ī��Ʈ: " + i++);
				
				
			}
		});

		setVisible(true);
	}

}

public class EventExFirst {

	public static void main(String[] args) {
		EventFrame f = new EventFrame();

	}

}

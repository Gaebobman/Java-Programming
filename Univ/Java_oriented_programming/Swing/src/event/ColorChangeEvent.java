package event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class ColorChangeFrame extends JFrame{
	JButton btn = new JButton("OK");
	public ColorChangeFrame() {
		setTitle("Event-driven Programming");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		getContentPane().add(btn);		
        btn.setBackground(Color.green);    
		setVisible(true);
		
		btn.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				if(btn.getText().equals("OK")) {
					btn.setBackground(Color.YELLOW);
					btn.setText("»Æ¿Œ");
				}else {
					btn.setBackground(Color.GREEN);
					btn.setText("OK");	
				}
			}
		});
	}

}

public class ColorChangeEvent {

	public static void main(String[] args) {
		ColorChangeFrame myFrame = new ColorChangeFrame();

	}

}

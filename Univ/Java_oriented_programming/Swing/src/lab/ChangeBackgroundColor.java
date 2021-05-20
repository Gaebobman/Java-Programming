package lab;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Chngbck extends JFrame {		
    JButton red = new JButton("red");
    JButton blue = new JButton("blue");
    JButton green = new JButton("green");
    
    Chngbck(){		
		setBounds(100, 100, 500, 500);	
		setTitle("Lab1-배경색 바꾸기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container c = getContentPane();			
		JPanel p = new JPanel();		
		p.setSize(new Dimension(500, 50));
		p.add(red);
		p.add(blue);
		p.add(green);	
		p.setBackground(Color.gray);
		
		c.add(p, BorderLayout.NORTH);		
		c.setBackground(Color.cyan);
		JPanel p2 = new JPanel();
		p2.setBackground(Color.RED);
		c.add(p2, BorderLayout.CENTER);
		
		red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				p2.setBackground(Color.RED);
			}
		});
		blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				p2.setBackground(Color.BLUE);
			}
		});
		green.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				p2.setBackground(Color.GREEN);
			}
		});
    }
//	public void actionPerformed(ActionEvent e) {
//		JButton button = (JButton)e.getSource();
//		if(button == red) {
//			red.setBackground(Color.RED);
//		}else if(button == blue) {
//			blue.setBackground(Color.BLUE);
//		}else if(button == green) {
//			green.setBackground(Color.GREEN);
//		}
//	}

	

}

public class ChangeBackgroundColor {

	public static void main(String[] args) {
		Chngbck frame = new Chngbck(); 
	}

}

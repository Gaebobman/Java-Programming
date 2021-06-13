package eventEx;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class ColorFrame extends JFrame{
	JButton b1 = new JButton("확인");
	ColorFrame (){
		setTitle("이벤트창");
		setBounds(300, 300, 300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		b1.setBackground(Color.yellow);
		c.add(b1);
		
		b1.addActionListener(new ActionListener() {
			int flag = 1;
			@Override
			public void actionPerformed(ActionEvent e) {
				if(flag == 1) {
					b1.setBackground(Color.green);
					b1.setText("OK");
					flag =0;
				}else if(flag == 0) {
					b1.setBackground(Color.YELLOW);
					b1.setText("확인");
					flag = 1;
				}
				
				
				
			}
		});
		
		
		
		setVisible(true);
	}
}

public class ColChangeEx {

	public static void main(String[] args) {
		ColorFrame f = new ColorFrame();
	}

}

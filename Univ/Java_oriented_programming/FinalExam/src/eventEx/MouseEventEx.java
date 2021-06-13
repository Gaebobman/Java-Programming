package eventEx;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class MouseEventExFrame extends JFrame{
	private JLabel la = new JLabel("Hello"); 
	
	MouseEventExFrame(){
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,300, 300,300);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
	
		c.setLayout(null);
		
		la.setSize(50,20);
		la.setLocation(30, 30);
		c.add(la);

		setVisible(true);
		
	}
	class MyMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}



public class MouseEventEx {

	public static void main(String[] args) {
		MouseEventExFrame f = new MouseEventExFrame();
	}

}

package mouseKeyEvent;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


class TFrame extends JFrame{
	JLabel la = new JLabel("입력 후 엔터를 입력하세요");
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(5,20);
	JTextArea ta2 = new JTextArea(5,20);

	TFrame() {
		setBounds(100,100,300,300);
		setTitle("키/마우스 이벤트 처리");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true); 
		
		Container c = getContentPane();
//		JScrollPane sp = new JScrollPane(ta);
		c.setLayout(new FlowLayout());
		c.add(la);
		c.add(tf);
		c.add(ta);
		c.add(new JScrollPane(ta2));
	
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x,y);
			}
		
		});
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText()+ "\n");				
			}
		});
		tf.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				ta2.append("mouseClicked (" + x + ", " + y + ")\n");
			}
		});
		
//		tf.addMouseListener(new MouseListener() {
//			
//			@Override
//			public void mouseReleased(MouseEvent e) {}
//			
//			@Override
//			public void mousePressed(MouseEvent e) {}
//			
//			@Override
//			public void mouseExited(MouseEvent e) {
//				ta2.append("mouseExited" +"\n");
//			}
//			
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				ta2.append("mouseEntered" +"\n");
//			}
//			
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				int x = e.getX();
//				int y = e.getY();
//				ta2.append("mouseClicked (" + x + ", " + y + ")\n");
//			}
//		});
	}
}

public class TextAreaEx {

	public static void main(String[] args) {
		TFrame frame = new TFrame();

	}

}


package mouseKeyEvent;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class KFrame extends JFrame{
	JLabel la = new JLabel("입력 후 엔터를 입력하세요");
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(5,20);
	JTextArea ta2 = new JTextArea(5,20);
	JTextArea ta3 = new JTextArea(5,20);
	KFrame() {
		setBounds(100,100,300,500);
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
		c.add(new JScrollPane(ta3));
		tf.setFocusable(true);
		tf.requestFocus();
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
		tf.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				int x = e.getKeyCode();
				char c = e.getKeyChar();
				String s = KeyEvent.getKeyText(x);
				ta3.append("KeyText: "+ s + " KeyCode: " +x + " KeyChar: "+ c +"\n");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
public class KeyEventEx {

	public static void main(String[] args) {
		KFrame frame = new KFrame();

	}

}

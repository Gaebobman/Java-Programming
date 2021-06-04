package mouseKeyEvent;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class CFrame extends JFrame{
	Container c = getContentPane();
	JLabel la = new JLabel("�Է� �� ���͸� �Է��ϼ���");
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(5,20);
	JTextArea ta2 = new JTextArea(5,20);
	JTextArea ta3 = new JTextArea(5,20);
	CFrame() {
		setBounds(100,100,300,500);
		setTitle("Ű/���콺 �̺�Ʈ ó��");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true); 
		
		
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
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				int x = e.getKeyCode();
				char c = e.getKeyChar();
				String s = KeyEvent.getKeyText(x);
				ta3.append("KeyText: "+ s + " KeyCode: " +x + " KeyChar: "+ c +"\n");
				
				if(c == '%') {
					CFrame.this.c.setBackground(Color.yellow);
				}else if(x == KeyEvent.VK_F1) {
					CFrame.this.c.setBackground(Color.green);
				}
			}
		});
	}
}
public class ColorChangeWithKey {

	public static void main(String[] args) {
		CFrame frame = new CFrame();

	}

}

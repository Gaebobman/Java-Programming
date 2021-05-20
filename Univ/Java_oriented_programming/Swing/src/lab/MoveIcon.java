package lab;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MoveFrame extends JFrame{
	
	ImageIcon icon = new ImageIcon("img/inha.png");
    JLabel target = new JLabel(icon);
    JButton left = new JButton("left");
    JButton right = new JButton("right");
    JButton up = new JButton("up");
    JButton down = new JButton("down");
    
	MoveFrame(){
		setBounds(100, 100, 500, 500);	
		setTitle("Lab2 - 아이콘 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container c = getContentPane();	
		
		JPanel p = new JPanel();
		p.setSize(new Dimension(500, 50));
		p.add(left);
		p.add(right);
		p.add(up);
		p.add(down);
		p.setBackground(Color.yellow);
		
		
		c.add(p, BorderLayout.NORTH);
		c.add(target, BorderLayout.CENTER);		
		c.setBackground(Color.cyan);
		
		left.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				target.setLocation(target.getX()-10, target.getY());
				
			}
		});
		right.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				 target.setLocation(target.getX()+10, target.getY());
			}
		});
		up.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
			    
				 target.setLocation(target.getX(), target.getY()+10);
			}
		});
		down.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				 target.setLocation(target.getX(), target.getY()-10);
			}
		});
	}
}
public class MoveIcon {

	public static void main(String[] args) {
		MoveFrame f = new MoveFrame();
	}

}

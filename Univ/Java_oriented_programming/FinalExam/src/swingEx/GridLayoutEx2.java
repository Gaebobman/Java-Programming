package swingEx;

import java.awt.*;
import javax.swing.*;

class GridLayoutFrame2 extends JFrame{
	GridLayoutFrame2(){
		setBounds(300,300, 300,200);
		setTitle("�׸��� ���̾ƿ� ����2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);
		c.setLayout(grid);
		
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�й�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�а�"));
		c.add(new JTextField(""));
		c.add(new JLabel("����"));
		c.add(new JTextField(""));
		
		setVisible(true);
		
		
	}
}

public class GridLayoutEx2 {

	public static void main(String[] args) {
		GridLayoutFrame2 f  = new GridLayoutFrame2();

	}

}

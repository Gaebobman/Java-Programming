package swingEx;

import java.awt.*;
import javax.swing.*;

class GridLayoutFrame extends JFrame{
	GridLayoutFrame (){
		setBounds(300,300, 300, 400);
		setTitle("±×¸®µå·¹ÀÌ¾Æ¿ô »ùÇÃ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new GridLayout(4, 3, 5, 5));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		c.add(new JButton("7"));
		c.add(new JButton("8"));
		c.add(new JButton("9"));
		c.add(new JButton("*"));
		c.add(new JButton("0"));
		
		setVisible(true);
		
	}
}


public class GridLayoutEx {

	public static void main(String[] args) {
		GridLayoutFrame frame = new GridLayoutFrame();

	}

}

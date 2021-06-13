package swingEx;
import java.awt.*;
import javax.swing.*;

class ContainerNoLayoutFrame extends JFrame{
	ContainerNoLayoutFrame(){
		setSize(300, 300);
		setTitle("My first Frame");
		setLocation(500, 500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		Container contentPane = getContentPane();	
		contentPane.setLayout(null);
		
		for(int i =0  ; i < 100; i++) {
			JLabel l = new JLabel("" + i);
			l.setBounds(i*12, i*12, 50 ,20);
			contentPane.add(l);
		}
		setVisible(true);
	}
}

public class ContainerNoLayout {

	public static void main(String[] args) {
		ContainerNoLayoutFrame f = new ContainerNoLayoutFrame();
		
	}

}

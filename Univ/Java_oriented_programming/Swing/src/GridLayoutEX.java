import java.awt.*;
import javax.swing.*;

class MyFrame4 extends JFrame {
	MyFrame4(){
		setSize(300, 300);
		setTitle("My first Frame");
		setLocation(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String os = System.getProperty("os.name");		
		String arch = System.getProperty("os.arch");
		String user = System.getProperty("user.name");
		int p = Runtime.getRuntime().availableProcessors();
		long m = Runtime.getRuntime().totalMemory();
						
		Container contentPane = getContentPane();	
		contentPane.setLayout(new GridLayout(5, 2, 20, 20));
		
		JLabel label1 = new JLabel("OS: ");
		JLabel label2 = new JLabel("ARCH: ");
		JLabel label3 = new JLabel("USER: ");
		JLabel label4 = new JLabel("CPU: ");
		JLabel label5 = new JLabel("MEM: ");
		JTextField tf1 = new JTextField(os);
		JTextField tf2 = new JTextField(arch);
		JTextField tf3 = new JTextField(user);
		JTextField tf4 = new JTextField(""+p);
		JTextField tf5 = new JTextField(""+m);
		contentPane.add(label1);
		contentPane.add(tf1);
		contentPane.add(label2);
		contentPane.add(tf2);
		contentPane.add(label3);
		contentPane.add(tf3);
		contentPane.add(label4);
		contentPane.add(tf4);
		contentPane.add(label5);
		contentPane.add(tf5);
				
		setVisible(true);
	}
}
public class GridLayoutEX {

	public static void main(String[] args) {
		 MyFrame4 myFrame4 = new  MyFrame4();

	}

}

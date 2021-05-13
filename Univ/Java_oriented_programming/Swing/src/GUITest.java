import javax.swing.*;



class MyFrame extends  JFrame{
	MyFrame(){
		
		setLocation(2500,200);
		setSize(400,200);
		setTitle("My First Frame!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class GUITest {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}

}

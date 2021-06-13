package swingEx;

import java.awt.*;
import java.util.Calendar;

import javax.swing.*;

class FlowLayoutFrame2 extends JFrame{
	FlowLayoutFrame2 (){
		setBounds(300,300,300,300);
		setTitle("�÷ο췹�̾ƿ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 40));
		
		ImageIcon icon = new ImageIcon("img/inha.png");
		JLabel imglabel = new JLabel(icon);
		JLabel l1 = new JLabel("��¥: ");
		JLabel l2 = new JLabel("�ð�: ");
		
		JTextField tf1 = new JTextField("");
		tf1.setEditable(false);
		tf1.setText("" + year +"-" +month +"-" +day);
		
		JTextField tf2 = new JTextField("");
		tf2.setEditable(false);
		tf2.setText("" + hour +":" +minute);
		
		c.add(imglabel);
		c.add(l1);
		c.add(tf1);
		c.add(l2);
		c.add(tf2);
		setVisible(true);
	}
}
public class FlowLayoutEx2 {

	public static void main(String[] args) {
		FlowLayoutFrame2 frame = new FlowLayoutFrame2();

	}

}

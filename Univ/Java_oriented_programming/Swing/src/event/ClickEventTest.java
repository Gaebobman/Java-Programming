package event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


//1 ���� Ŭ������ Action �̺�Ʈ ������ �ۼ��ϴ� ���
//class plusButtonListener implements ActionListener{
//	int cnt;
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		JButton btn = (JButton) e.getSource();
//		btn.setText("" + cnt++);
//	}
//	
//}

class FrameClickEvt extends JFrame{
	JLabel label = new JLabel("ȫ�浿", 0);
	JButton btn = new JButton("ī��Ʈ+");
	JButton btn2 = new JButton("ī��Ʈ-");
	//3
	int cnt;
	FrameClickEvt() {
		setBounds(2600,100,300,200);
		setTitle("Event Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		getContentPane().add(btn, BorderLayout.WEST);
		getContentPane().add(label, BorderLayout.CENTER);
		getContentPane().add(btn2, BorderLayout.EAST);
		
		//1, 2
//		btn.addActionListener(new plusButtonListener());
		
		//3 �͸�Ŭ������ ���� label ���� ����
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				label.setText("" + cnt++);
				
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				label.setText("" + cnt--);
				
			}
		});
	}
	//2 �����ʸ� ���� Ŭ������ ����
//	class plusButtonListener implements ActionListener{
//		int cnt;
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			JButton btn = (JButton) e.getSource();
//			btn.setText("" + cnt++);
//		}
//	}
}

public class ClickEventTest {
	public static void main(String[] args) {
		FrameClickEvt myFrame = new FrameClickEvt();

	}

}

package event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


//1 독립 클래스로 Action 이벤트 리스너 작성하는 방법
//class plusButtonListener implements ActionListener{
//	int cnt;
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		JButton btn = (JButton) e.getSource();
//		btn.setText("" + cnt++);
//	}
//	
//}

class FrameClickEvt extends JFrame implements ActionListener{
	JLabel label = new JLabel("초기상태");
	JButton btn = new JButton("카운트+");
	JButton btn2 = new JButton("카운트-");
	//3
	
	//2 리스너를 내부 클래스로 구현
//	class plusButtonListener implements ActionListener{
//		int cnt;
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			JButton btn = (JButton) e.getSource();
//			btn.setText("" + cnt++);
//		}
//	}
	
	int cnt;
	FrameClickEvt() {
		setBounds(2600,100,300,200);
		setTitle("Event Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		getContentPane().add(btn, BorderLayout.WEST);
		getContentPane().add(label, BorderLayout.CENTER);
		getContentPane().add(btn2, BorderLayout.EAST);
		//또는
//		Container c = getContentPane();
//		c.add(btn, BorderLayout.WEST);
//		c.add(label, BorderLayout.CENTER);
//		c.add(btn2, BorderLayout.EAST);
//		
		
		//1, 2
//		btn.addActionListener(new plusButtonListener());
		
		//3 익명클래스로 구현 label 숫자 증가
//		btn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JButton btn = (JButton) e.getSource();
//				label.setText("" + cnt++);
//				
//			}
//		});
//		btn2.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				JButton btn = (JButton) e.getSource();
//				label.setText("" + cnt--);
//				
//			}
//		});
		
		btn.addActionListener(this);
		btn2.addActionListener(this);
	}
	//4 Frame에서 직접 처리하는 방법
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		if(button == btn) {
			label.setText("" + cnt++);
		}else if(button == btn2) {
			label.setText("" + cnt--);
		}
	}
}

public class ClickEventTest {
	public static void main(String[] args) {
		FrameClickEvt myFrame = new FrameClickEvt();

	}

}

package lab;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class GenFrame extends JFrame{
	
	JLabel l1 = new JLabel("비밀번호 자리수");
	JTextField tf1= new JTextField(5);
	JButton genBtn = new JButton("자동생성");
	
	JLabel l2 = new JLabel("비밀번호: ");
	GenFrame(){
		setBounds(700,100,500,500);
		setTitle("비밀번호 생성기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JPanel p1 = new JPanel();
		
		p1.setSize(500,50);
		p1.setBackground(Color.yellow);
		
		p1.add(l1);
		p1.add(tf1);
		p1.add(genBtn);
		
		c.add(p1,BorderLayout.NORTH);	
		c.add(l2);
		pack();
		
		genBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int d;
				try {
					d = Integer.parseInt(tf1.getText());
					
				} catch (NumberFormatException e1) {
					return;
				}
				l2.setText(randomPw(d));
			}
		});
		
		
		
		setVisible(true);
	}
	
	
	public static String randomPw(int d){
	    char candidate[] = new char[] {
	                      '1','2','3','4','5','6','7','8','9','0',
	                      'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
	                      'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
	                      '!','@','#','$','%','^','&','*','(',')'};

	    String ranPassword = "";

	    for (int i = 0; i < d; i++) {
	      int rand = (int)(Math.random()*(candidate.length));
	      ranPassword += candidate[rand];
	    }
	  return ranPassword;
	}	
}

public class PwdGenerator {
	

	public static void main(String[] args) {
		GenFrame frame = new GenFrame();

	}

}

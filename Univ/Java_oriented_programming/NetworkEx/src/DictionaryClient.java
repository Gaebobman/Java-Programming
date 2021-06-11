import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.*;


public class DictionaryClient extends JFrame {
	JLabel la = new JLabel("영어: ");
	JTextField tf = new JTextField(5);
	JButton btn = new JButton("검색");
	JLabel resultLabel = new JLabel("결과: ");
	
	DictionaryClient() {
		setBounds(100, 100, 500, 500);
		setTitle("원격 영어사전");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container c = getContentPane();
		JPanel p = new JPanel();
		
		p.setSize(500, 50);
		p.add(la); p.add(tf); p.add(btn);
		p.setBackground(Color.yellow);
		
		c.add(p, BorderLayout.NORTH);
		c.add(resultLabel, BorderLayout.CENTER);
		c.setBackground(Color.cyan);
		pack();
		
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					Socket socket = new Socket("localhost", 9712);
					DataInputStream dis = new DataInputStream(socket.getInputStream());
					DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
					
					dos.writeUTF(tf.getText());
					resultLabel.setText("결과: " + dis.readUTF());
					socket.close();
				} catch (Exception e2) {}
			}
		});
	}
	
	
	
	public static void main(String[] args) throws UnknownHostException, IOException{
		DictionaryClient frame = new DictionaryClient();

	}

}

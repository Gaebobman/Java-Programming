package hwCalculator;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class MyCalculator extends JFrame implements ActionListener {
	private JTextField txt;
	private JPanel panel;
	
	int arg;
	String operator = "";
	public MyCalculator() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		txt = new JTextField(20);
		add(txt, BorderLayout.NORTH);
		panel = new JPanel();
		panel.setLayout(new GridLayout(5, 4));
		add(panel, BorderLayout.CENTER);
		
		JButton toTheMinus= new JButton("1 / ⅹ");
		toTheMinus.setPreferredSize(new Dimension(100, 50));
		panel.add(toTheMinus);
		
		JButton square= new JButton("ⅹ²");
		square.setPreferredSize(new Dimension(100, 50));
		panel.add(square);
		
		JButton squareRoot= new JButton("√");
		squareRoot.setPreferredSize(new Dimension(100, 50));
		panel.add(squareRoot);
		
		JButton division= new JButton("÷");
		division.setPreferredSize(new Dimension(100, 50));
		panel.add(division);

		JButton times = new JButton("×");
		times.setPreferredSize(new Dimension(100, 50));		
		
		JButton minus = new JButton("-");
		minus.setPreferredSize(new Dimension(100, 50));
		
		for (int i = 1; i <= 9; i++) {
			if(i == 4) {
				panel.add(times);
			}else if(i == 7) {
				panel.add(minus);
			}
			
			JButton btn = new JButton("" + i);
			btn.addActionListener(this);
			btn.setPreferredSize(new Dimension(100, 50));		
			panel.add(btn);
		}
		
		JButton plus = new JButton("+");
		plus.setPreferredSize(new Dimension(100, 50));
		panel.add(plus);
				
		JButton clear = new JButton("C");
		clear.setPreferredSize(new Dimension(100, 50));
		panel.add(clear);
		
		JButton erase = new JButton("←");
		erase.setPreferredSize(new Dimension(100, 50));
		panel.add(erase);
		
	    JButton btnZero = new JButton("" + 0);
		btnZero.addActionListener(this);
		btnZero.setPreferredSize(new Dimension(100, 50));	
		panel.add(btnZero);
		
		JButton calculate = new JButton("=");
		calculate.setPreferredSize(new Dimension(100, 50));
		panel.add(calculate);
		
		
		
		toTheMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String strArg = txt.getText();
				if(strArg.equals(""))
					return;
				else if(strArg.contains(".")) {
					operator = "toTheMinus";
					txt.setText("" + arg);
					return;
				}
				operator = "toTheMinus";
				arg = Integer.parseInt(txt.getText());
				float x = 1 / (float)arg;
				txt.setText("" + x);				
			}
		});
		squareRoot.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				String strArg = txt.getText();
				if(strArg.equals(""))
					return;
				operator = "squareRoot";
				arg = Integer.parseInt(txt.getText());
				float x = (float) Math.sqrt(arg);
				txt.setText("" + x);		
				
			}
		});
		
		plus.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				String strArg = txt.getText();
				if(strArg.equals(""))
					return;
				operator = "plus";
				arg = Integer.parseInt(txt.getText());
				txt.setText("");				
			}
		});
		
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String strArg = txt.getText();
				if(strArg.equals(""))
					return;
				operator = "minus";
				arg = Integer.parseInt(txt.getText());
				txt.setText("");				
			}
		});
		
		times.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String strArg = txt.getText();
				if(strArg.equals(""))
					return;
				operator = "times";
				arg = Integer.parseInt(txt.getText());
				txt.setText("");			
				
			}
		});
		division.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String strArg = txt.getText();
				if(strArg.equals("") || strArg.equals("0"))
					return;
				operator = "division";
				arg = Integer.parseInt(txt.getText());
				txt.setText("");			
				
			}
		});
		
		square.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				String strArg = txt.getText();
				if(strArg.equals(""))
					return;
				operator  = "square";
				arg = Integer.parseInt(txt.getText());
				arg = (int) Math.pow(arg, 2);
				txt.setText(""+arg);
			}
		});
		erase.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String strArg = txt.getText();
				if(strArg.equals(""))
					return;
				strArg = strArg.substring(0, strArg.length()-1);
				txt.setText("" + strArg);
				
			}
		});
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txt.setText("");
				
			}
		});
		calculate.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {	
				int result = 0;
				if(operator.equals("plus")) {
					int cur = Integer.parseInt(txt.getText());	
					result = cur + arg;		
					txt.setText("" + result);	
				}else if(operator.equals("minus")) {
					int cur = Integer.parseInt(txt.getText());	
					result = arg - cur;
					txt.setText("" + result);		
				}else if(operator.equals("times")) {
					int cur = Integer.parseInt(txt.getText());	
					result = arg * cur;
					txt.setText("" + result);	
				}else if(operator.equals("division")) {
					int cur = Integer.parseInt(txt.getText());	
					if(cur == 0) {
						JOptionPane.showMessageDialog(null, "0으로 나눌 수 없습니다.", "경고창", 
								JOptionPane.WARNING_MESSAGE);
						txt.setText("");
						arg = 0;
						return;
					}
					result = arg / cur;
					txt.setText("" + result);	
				}						
//				txt.setText(""+ result);	
			}
		});
		
		pack();
		setResizable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		txt.setText(txt.getText() + actionCommand);
	}
}

public class SwingCalculator {

	public static void main(String[] args) {
		MyCalculator frame = new MyCalculator();

	}

}

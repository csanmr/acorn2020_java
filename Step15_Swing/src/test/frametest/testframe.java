package test.frametest;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class testframe extends JFrame implements ActionListener {
	//필드
	JTextField inputnum;
	JTextField inputnum2;
	static final String COMMAND_PLUS="plus";
	static final String COMMAND_MINUS="minus";
	static final String COMMAND_MULTIPLE="multiple";
	static final String COMMAND_DIVISION="division";
	
	JLabel lab1;
	JLabel lab2;
	public testframe() {
		inputnum=new JTextField(5);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(inputnum);
		
		JButton plus=new JButton("+");
		add(plus);
		plus.setActionCommand(COMMAND_PLUS);
		plus.addActionListener(this);
		
		JButton minus=new JButton("-");
		add(minus);
		minus.setActionCommand(COMMAND_MINUS);
		minus.addActionListener(this);
		
		JButton multiple=new JButton("*");
		add(multiple);
		multiple.setActionCommand(COMMAND_MULTIPLE);
		multiple.addActionListener(this);
		
		JButton division=new JButton("/");
		add(division);
		division.setActionCommand(COMMAND_DIVISION);
		division.addActionListener(this);
		
		inputnum2=new JTextField(5);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(inputnum2);
		
		lab1=new JLabel("=");
		add(lab1);
		
		lab2=new JLabel();
		add(lab2);
		
		}
	public static void main(String[] args) {
		testframe a=new testframe();
		a.setTitle("테스트");
		a.setBounds(100, 100, 500, 500);
		a.setVisible(true);
		a.setDefaultCloseOperation(3);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command=e.getActionCommand();
		if(command.equals(COMMAND_PLUS)) {
			String msg=inputnum.getText();
			String msg2=inputnum2.getText();
			int msgnum=Integer.parseInt(msg);
			int msgnum2=Integer.parseInt(msg2);
			String rkqt=Integer.toString(msgnum+msgnum2);
			lab2.setText(rkqt);
			
		}else if(command.equals(COMMAND_MINUS)) {
			String msg=inputnum.getText();
			String msg2=inputnum2.getText();
			int msgnum=Integer.parseInt(msg);
			int msgnum2=Integer.parseInt(msg2);
			String rkqt=Integer.toString(msgnum-msgnum2);
			lab2.setText(rkqt);
			
		}else if(command.equals(COMMAND_MULTIPLE)){
			String msg=inputnum.getText();
			String msg2=inputnum2.getText();
			int msgnum=Integer.parseInt(msg);
			int msgnum2=Integer.parseInt(msg2);
			String rkqt=Integer.toString(msgnum*msgnum2);
			lab2.setText(rkqt);
			
		}else {
			String msg=inputnum.getText();
			String msg2=inputnum2.getText();
			double msgnum=Double.parseDouble(msg);
			double msgnum2=Double.parseDouble(msg2);
			String rkqt=Double.toString(msgnum/msgnum2);
			lab2.setText(rkqt);
			//숫자 안 넣었을 때 해야하는 거 추가해야함 try,catch NumberFormatException
		}
		
	}
}

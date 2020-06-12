package test.frame10;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener, KeyListener {
	//필드
	JTextField inputMsg;
	JLabel lab1;
	
	//default 생성자
	public MyFrame() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		//문자열 한줄을 입력할 수 있는 JTextField
		inputMsg=new JTextField(10);
		add(inputMsg);
		inputMsg.addKeyListener(this);
		
		JButton sendBtn=new JButton("전송");
		sendBtn.addActionListener(this);
		add(sendBtn);
		
		//JLabel 객체 생성
		lab1=new JLabel("label입니다.");
		add(lab1);
	}
	
	public static void main(String[] args) {
		//MyFrame 클래스를 이용해서 객체 생성하고 참조값을 지역변수 frame에 담기
		MyFrame frame=new MyFrame();
		//프레임의 제목 설정
		frame.setTitle("나의 프레임");
		//프레임을 닫으면 자동으로 프로세스가 종료되도록 한다 3=JFrame.EXIT_ON_CLOSE 와같다
		frame.setDefaultCloseOperation(3);
		frame.setBounds(100, 100, 500, 500);
		frame.setVisible(true);
	}
	//ActionListener 인터페이스를 구현해서 강제오버라이드 된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		//JTextField에 입력한 문자열을 읽어와야한다.
		String msg=inputMsg.getText();
		//읽어온 문자열을 JLabel에 추가하기
		lab1.setText(msg);
		//입력창 문자열 삭제하기
		inputMsg.setText("");
		
	}
	//키를 눌렀을 때 호출되는 메소드
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("pressed");
		//눌러진 키보드의 코드값을 읽어온다.
		int code=e.getKeyCode();
		if(code==KeyEvent.VK_ENTER) { //엔터키를 눌렀다면
			//JTextField에 입력한 문자열을 읽어와야한다.
			String msg=inputMsg.getText();
			//읽어온 문자열을 JLabel에 추가하기
			lab1.setText(msg);
			//입력창 문자열 삭제하기
			inputMsg.setText("");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("released");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("typed");
	}
}

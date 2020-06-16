package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import test.mypac.CountRunnable;
import test.mypac.CountThread;

public class Frame03 extends JFrame implements ActionListener {
	//생성자
	public Frame03() {
		//레이아웃 설정
		setLayout(new BorderLayout());
		//패널을 프레임의 상단에 배치
		JPanel panel=new JPanel();
		panel.setBackground(Color.YELLOW);
		add(panel, BorderLayout.NORTH);
		
		JButton countBtn=new JButton("1~10까지 세기");
		panel.add(countBtn);
		//버튼에 리스너 등록하기
		countBtn.addActionListener(this);
	}
	public static void main(String[] args) {
		//Myframe 클래스를 이용해서 객체를 생성하고 참조값을 지역변수 frame에담기
		Frame03 frame=new Frame03();
		//프레임의 제목 설정
		frame.setTitle("Frame01");
		frame.setDefaultCloseOperation(3);
		frame.setBounds(100,100,500,500);
		frame.setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//Runnable 인터페이를 구현한 클래스로 객체 생성
		CountRunnable r=new CountRunnable();
		//Thread 객체를 생성하면서 생성자의 인자로 전달한다.
		Thread t=new Thread(r);
		//start()메소드를 호출해서 새로운 스레드를 시작한다.
		t.start();
		System.out.println("새로운 스레드를 시작했습니다.");
	}

}

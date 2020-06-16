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

public class Frame04 extends JFrame implements ActionListener {
	//생성자
	public Frame04() {
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
		Frame04 frame=new Frame04();
		//프레임의 제목 설정
		frame.setTitle("Frame01");
		frame.setDefaultCloseOperation(3);
		frame.setBounds(100,100,500,500);
		frame.setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//Runnable 인터페이스를 구현한 클래스로 객체 생성
		Runnable r=new Runnable() {
			@Override
			public void run() {
				//run()  메소드 안쪽이 새로운 작업단위가 된다. 
				int count=0;
				while(true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					count++; //count 를 1 증가 시킨다.
					System.out.println("현재 카운트:"+count);
					if(count==10) {//카운트가 10이 되면 
						break;//반복문 탈출 
					}
				}		
			}
		};
		//Thread 객체를 생성하면서 생성자의 인자로 전달한다.
		Thread t=new Thread(r);
		//start() 메소드를 호출해서 새로운 스레드를 시작한다.
		t.start();
		System.out.println("새로운 스레드를 시작 했습니다.");
	}
}

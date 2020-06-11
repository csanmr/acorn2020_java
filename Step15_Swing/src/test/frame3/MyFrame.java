package test.frame3;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	//생성자
	public MyFrame(String title) {
		super(title);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//레이아웃 매니저를 GridLayout으로 지정하기 (2행 2열)
		setLayout(new GridLayout(2,2));
		
		JButton btn1=new JButton("버튼1");
		add(btn1);
		
		JButton btn2=new JButton("버튼2");
		add(btn2);
		
		JButton btn3=new JButton("버튼3");
		add(btn3);
		
		JButton btn4=new JButton("버튼4");
		add(btn4);
		
		setVisible(true);
	}
		//여긴 프레임레이아웃을 null로 했을 때.
//		JButton btn1=new JButton("버튼1");
//		//버튼의 위치
//		btn1.setLocation(10, 10);
//		//버튼의 크기
//		btn1.setSize(100, 30); //setLocation과 Size를 같이 쓰는게 setBounds
//		add(btn1); // 프레임에 btn1추가하기
//		
//		JButton btn2=new JButton("버튼2");
//		//버튼의 위치와 크기를 한번에 지정하기
//		btn2.setBounds(120, 10, 100, 30);
//		add(btn2); //프레임에 btn2추가하기
//		
//		JButton btn3=new JButton("버튼3");
//		btn3.setBounds(230, 10, 100, 30);
//		add(btn3);
//		
//		JButton btn4=new JButton("버튼4");
//		btn4.setBounds(340, 10, 100, 30);
//		add(btn4);
//		
//		setVisible(true);
//	}
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}

}

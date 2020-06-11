package test.main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainClass01 {
	public static void main(String[] args) {
		//JFrame 객체 생성하고
		JFrame f=new JFrame("Hello Frame");
		//초기위치와크기지정
		f.setBounds(100, 100, 500, 500);
		//프레임을 닫았을 때 자동으로 프로세스 종료되도록
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//레이아웃 매니저를 사용하지 않도록 설정
		f.setLayout(null);
		//버튼객체 생성
		JButton btn=new JButton("눌러보셈");
		//버튼의 위치와 크기 지정
		btn.setBounds(10, 10, 100, 40);
		//프레임에 버튼 추가하기
		f.add(btn);
		
		//프레임이 보이도록 한다.
		f.setVisible(true);
		
		new MyFrame("나만의 프레임");
	}
	public static class MyFrame extends JFrame{
		//생성자
		public MyFrame(String title) {
			super(title);
			//초기화 작업
			this.setBounds(200, 200, 500, 500);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(null);
			JButton btn2=new JButton("눌러보셈2");
			btn2.setBounds(10, 10, 100, 100);
			this.add(btn2);
			this.setVisible(true);
			
		}
	}
}

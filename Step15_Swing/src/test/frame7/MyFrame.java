package test.frame7;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener {
		//버튼 필드에 정의하기
		JButton sendBtn;
		JButton removeBtn;
	//default 생성자
	public MyFrame() {
		//레이아웃 매니저 지정하기
		setLayout(new FlowLayout());
		//버튼
		this.sendBtn=new JButton("전송"); //필드에 정의해놔서 this.으로 생성가능 아래 것과 같음,생략가능
		removeBtn=new JButton("삭제");
		
		//프레임에 버튼 추가하기(FlowLayout의 영향을 받는다)
		add(sendBtn);
		add(removeBtn);
		
		ActionListener a=this; //this는 액션리스너,마이프레임,제이프레임 이기도 하다
		MyFrame b=this;
		JFrame c=this;
		
		//MyFrame 객체의 참조값을 전달해서 리스너 등록하기
		sendBtn.addActionListener(this);
		removeBtn.addActionListener(this);
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
		// TODO Auto-generated method stub
		//이벤트가 발생한 UI(JButton)의 참조값을 얻어온다.
		Object obj=e.getSource();
		
		if(obj==sendBtn) { //전송버튼을 눌렀다면
			JOptionPane.showMessageDialog(this, "전송합니다");
		}else if(obj==removeBtn){ //삭제 버튼을 눌렀다면
			JOptionPane.showMessageDialog(this, "삭제합니다");
		}
		
		
	}
}

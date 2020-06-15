package test.frame11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Myframe extends JFrame implements ActionListener{
	//필드
	JTextField tf_num1, tf_num2;
	JLabel label_result;
	
	public Myframe() {
		//프레임의 레이아웃 설정하기
		setLayout(new BorderLayout());
		
		//Panel
		JPanel topPanel=new JPanel();
		topPanel.setBackground(Color.YELLOW);
		//Panel을 북쪽에 배치하기
		add(topPanel, BorderLayout.NORTH);
		
		//JTextField 객체를 만들어서 JPanel에 추가하기
		tf_num1=new JTextField(10);
		topPanel.add(tf_num1);
		//기능 버튼 객체를 만들어서 JPanel에 추가하기
		JButton plusBtn=new JButton("+");
		JButton minusBtn=new JButton("-");
		JButton multiBtn=new JButton("*");
		JButton divideBtn=new JButton("/");
		topPanel.add(plusBtn);
		topPanel.add(minusBtn);
		topPanel.add(multiBtn);
		topPanel.add(divideBtn);
		//두번째 JTextField만들어서 패널에 추가
		tf_num2=new JTextField(10);
		topPanel.add(tf_num2);
		//JLabel
		JLabel label1=new JLabel("=");
		JLabel label_result=new JLabel("0");
		//패널에 레이블 추가하기
		topPanel.add(label1);
		topPanel.add(label_result);
		
		//버트네 리스너 등록하기
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multiBtn.addActionListener(this);
		divideBtn.addActionListener(this);
		//버튼에 command지정하기
		plusBtn.setActionCommand("plus");
		minusBtn.setActionCommand("minus");
		multiBtn.setActionCommand("multi");
		divideBtn.setActionCommand("divide");
		
	}
	public static void main(String[] args) {
		Myframe frame=new Myframe();
		//프레임의 제목 설정
		frame.setTitle("계산기");
		//프레임을 닫으면 자동으로 프로세스가 종료되도록 한다
		frame.setDefaultCloseOperation(3);
		frame.setBounds(100, 100, 500, 500);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//JTextField에 입력한 문자열을 읽어와서 숫자(실수)로 바꿔준다.
		double num1=Double.parseDouble(tf_num1.getText());
		double num2=Double.parseDouble(tf_num2.getText());
		//연산의 결과값을 담을 지역변수
		double result=0;
		
		// TODO Auto-generated method stub
		//눌러진 버튼의 command 읽어오기
		String command=e.getActionCommand();
		if(command.equals("plus")) {
			result=num1+num2;
		}else if(command.equals("minus")) {
			result=num1-num2;
		}else if(command.equals("multi")) {
			result=num1*num2;
		}else if(command.equals("divide")) {
			result=num1/num2;
		}
		//결과 값을 JLabel에 출력하기
		label_result.setText(Double.toString(result));
	}
}
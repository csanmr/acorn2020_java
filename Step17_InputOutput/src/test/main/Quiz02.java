package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz02 extends JFrame implements ActionListener {
	//필드
	JTextField tf_msg;
	//생성자
	public Quiz02() {
		
		setTitle("나의 프레임");
		setLayout(new BorderLayout());
		JPanel topPanel=new JPanel();
		//JTextField 객체의 참조값을 필드에 저장
		tf_msg=new JTextField(10);
		JButton appendBtn=new JButton("추가하기");
		appendBtn.addActionListener(this);
		appendBtn.setActionCommand("append");
		topPanel.add(tf_msg);
		topPanel.add(appendBtn);
		add(topPanel, BorderLayout.NORTH);
		topPanel.setBackground(Color.YELLOW);
		
	}
	public static void main(String[] args) {
		Quiz02 f=new Quiz02();
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		File QuizFile=new File("c:/acorn2020/myFolder/memo.txt");
		String command=arg0.getActionCommand();
		if(command.equals("append")) {
			String vs=tf_msg.getText();
			try {
				FileWriter qz=new FileWriter(QuizFile, true);
				qz.append(vs);
				qz.append("\r\n");
				qz.close();
				JOptionPane.showMessageDialog(this,"저장했습니다.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}



/*
 * 선생님이 하신 거
@Override
public void actionPerformed(ActionEvent arg0) {
// TODO Auto-generated method stub
1.JTextField에 입력한 문자열을 읽어와서
	String str=tf_msg.getText();
2. memo.txt파일에 저장하기
	File File1=new File("c:/acorn2020/myFolder/memo.txt");
	String command=arg0.getActionCommand();
		try {
			boolean isExist=file1.exists();
			if(!isExist) {
				file1.createNewFile();
			}
			// new FileWriter(File 객체, append 모드 여부)
			FileWriter fw=new FileWriter(file1, true);
			//fw.write(str);
			fw.append(str);
			fw.append("\r\n");
			//fw.flush();
			fw.close(); //자동 flush 된다.
			JOptionPane.showMessageDialog(this,"저장했습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
*/


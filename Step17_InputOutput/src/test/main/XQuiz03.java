package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class XQuiz03 extends JFrame implements ActionListener {
	//필드
	JTextArea area;
	JTextField tf_msg;
	//생성자
	public XQuiz03() {
		setTitle("나의 프레임");
		setLayout(new BorderLayout());
		JPanel topPanel=new JPanel();
		
		//JTextField 객체의 참조값을 필드에 저장
		tf_msg=new JTextField(10);
		
		JButton appendBtn=new JButton("추가하기");
		JButton loadBtn=new JButton("불러오기");//
		//버튼리스너 등록하기
		appendBtn.addActionListener(this);
		loadBtn.addActionListener(this);
		
		appendBtn.setActionCommand("append");
		loadBtn.setActionCommand("load");
		
		topPanel.add(tf_msg);
		topPanel.add(appendBtn);
		topPanel.add(loadBtn);
		
		add(topPanel, BorderLayout.NORTH);
		topPanel.setBackground(Color.YELLOW);
		
		//JTextArea
		area=new JTextArea(); //
		//프레임의 가운데에 JTextArea  배치하기
		add(area,BorderLayout.CENTER);
		
	}
	public static void main(String[] args) {
		XQuiz03 f=new XQuiz03();
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);	
	}
	@Override
	public void actionPerformed(ActionEvent event) {
	// TODO Auto-generated method stub
	//1.JTextField에 입력한 문자열을 읽어와서
		String str=tf_msg.getText();
	//2. memo.txt파일에 저장하고 load버튼 누르면 JTextArea에 문자열 출력
		File file1=new File("c:/acorn2020/myFolder/memo.txt");
		//눌러진 버튼의 액션커맨드 읽어오기
		String command=event.getActionCommand();
		if(command.equals("append")) { //추가 버튼을 눌렀을 때
			append(); //**
//			try {
//				boolean isExist=file1.exists();
//				if(!isExist) {
//					file1.createNewFile();
//				}
//				// new FileWriter(File 객체, append 모드 여부)
//				FileWriter fw=new FileWriter(file1, true);
//				//fw.write(str);
//				fw.append(str);
//				fw.append("\r\n");
//				//fw.flush();
//				fw.close(); //자동 flush 된다.
//				JOptionPane.showMessageDialog(this,"저장했습니다.");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//				}
			}else if(command.equals("load")) { //불러오기 버튼을 눌렀을 때
				load(); //**
				try {
					FileReader fr=new FileReader(file1);
					BufferedReader br=new BufferedReader(fr);
					
					while(true) {
						String line=br.readLine();
						area.append(line);
						area.append("\r\n"); //개행기호도 출력해준다
						if(line==null) {
							break;
						}
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	//추가작업을 하는 메소드 **
	public void append() { // 이렇게 따로 메소드를 작업하고 위에 액션리스너에 append();로 넣어줄 수도 있다.
		String str=tf_msg.getText();
		File file1=new File("c:/acorn2020/myFolder/memo.txt");
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
	public void load() {
		
	}
}
package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame extends JFrame implements ActionListener {
	//필드
	JTextField inputName;
	JTextField inputAddr;
	DefaultTableModel model;
	JTable table;
	//생성자
	public MemberFrame() {
		setLayout(new BorderLayout());
		
		JLabel label1=new JLabel("이름");
		inputName=new JTextField(10);
		
		JLabel label2=new JLabel("주소");
		inputAddr=new JTextField(10);
		
		JButton saveBtn=new JButton("저장");
		saveBtn.setActionCommand("save");
		saveBtn.addActionListener(this);
		
		JButton deleteBtn=new JButton("삭제");
		deleteBtn.setActionCommand("delete");
		deleteBtn.addActionListener(this);
		
		JPanel panel=new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(saveBtn);
		panel.add(deleteBtn);
		
		add(panel, BorderLayout.NORTH);
		
		//표 형식으로 정보를 출력하기 위한 JTable
		table=new JTable();
		//칼럼명을 String[]에 순서대로 준비
		String[] colNames= {"번호", "이름", "주소"};
		//테이블에 출력할 정보를 가지고 있는 모델 객체 (칼럼명, row의 개수)
		model=new DefaultTableModel(colNames, 0);
		//모델을 테이블에 연결한다
		table.setModel(model);
		//스크롤이 가능하도록 테이블을 JScrollPane에 감싼다
		JScrollPane scroll=new JScrollPane(table);
		//JScrollPane을 프레임의 가운데에 배치
		add(scroll, BorderLayout.CENTER);
		
		
		//JTable에 sample data 출력해보기
		/*
		Object[] row1= {1, "김구라", "노량진"};
		Object[] row2= {2, "해골", "행신동"};
		model.addRow(row1);
		model.addRow(row2);
		*/
		displayMember();
		
	}
	//테이블에 회원 목록을 출력하는 메소드
	public void displayMember() {
		//row의 개수를 강제로 0으로 지정해서 삭제한다(새로 불러올 때 다시 처음부터 불러옴)
		model.setRowCount(0);
		//회원 목록을 얻어와서
		MemberDao dao=MemberDao.getInstance();
		List<MemberDto> list=dao.getList();
		for(int i=0; i<list.size(); i++) {
			MemberDto tmp=list.get(i);
			Object[] row= {tmp.getNum(),tmp.getName(),tmp.getAddr()};
			model.addRow(row);
		}
		/* 확장for문
		 * for(MemberDto tmp:list){
		 * Object[] arr= {tmp.getNum(),tmp.getName(),tmp.getAddr()};
		 * model.addRow(row);
		 */
	}
	
	//main 메소드
	public static void main(String[] args) {
		MemberFrame f=new MemberFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//액션 command읽어오기
		String command=e.getActionCommand();
		MemberDto dto=new MemberDto();
		MemberDao dao=MemberDao.getInstance();
		if(command.equals("save")) {
			//입력한 문자열을 읽어와서
			String name=inputName.getText();
			String addr=inputAddr.getText();
			//MemberDto 객체에 담아서 나는 MemberDto dto=new MemberDto();를 위에서 함
			dto.setName(name);
			dto.setAddr(addr);
			//MamberDao 객체를 이용해서 DB에 저장
			//MemberDao dao=MemberDao.getInstance(); 나는 이걸 위에 함
			//dao.insert(dto); //이거나
			boolean isSuccess=dao.insert(dto); //이거 둘 중 하나 사용가능
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, name+" 님의 정보를 추가했습니다.");
			}else {
				JOptionPane.showMessageDialog(this, "추가실패!");
			}
			//JTable에 목록 다시 출력하기
			displayMember();
		}else if(command.equals("delete")) {
			//1. 선택된 row인덱스를 읽어온다
			int selectedIndex=table.getSelectedRow();
			if(selectedIndex==-1) {
				return; //메소드를 여기서 끝내라(리턴해라)
			}
			//2. 선택된 row의 첫번째 칼럼의 숫자를 읽어온다.(삭제할 회원의 번호)
			int num=(int)model.getValueAt(selectedIndex, 0);
			//3. MemberDao 객체를 이용해서 회원정보를 삭제한다.
			dao.delete(num);
			//4. table에 회원목록 다시 출력하기.
			displayMember();
		}
	}
}

package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
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
import javax.swing.table.TableModel;


import test.dao.MemoDao;

import test.dto.MemoDto;


/*
 * create table memo
 * 	(num number primary key,
 * 	content varchar2(30), 
 * 	regdate date);
 * 
 * create sequence memo_seq;
 * 
 * 위와 같은 테이블과 시퀀스를 만들고 해당 테이블에 데이터를
 * select, insert, update, delete 기능을 수행할 수 있는 MemoFrame을 만들어보세요.
 * 
 * 조건
 * 1. num칼럼의 값은 시퀀스를 이용해서 넣으세요.
 * 2. regdate 칼럼(등록일)의 값은 sysdate를 이용해서 넣으세요.
 * 3. 수정은 content만 수정가능하게 하세요
 * 4. MemoDto, MemoDao를 만들어서 프로그래밍 하세요.
 */
public class MemoFrame extends JFrame implements ActionListener, PropertyChangeListener {
	//필드
	JLabel label;
	JTextField imm;
	JButton saveBtn, deleteBtn;
	JTable table;
	DefaultTableModel model;
	//생성자
	public MemoFrame() {
		setLayout(new BorderLayout());
		
		label=new JLabel("내용");
		imm=new JTextField(10);
		
		saveBtn=new JButton("저장");
		saveBtn.setActionCommand("save");
		saveBtn.addActionListener(this);
		deleteBtn=new JButton("삭제");
		deleteBtn.setActionCommand("delete");
		deleteBtn.addActionListener(this);
		
		JPanel panel=new JPanel();
		panel.add(label);
		panel.add(imm);
		panel.add(saveBtn);
		panel.add(deleteBtn);
		add(panel, BorderLayout.NORTH);
		
		table=new JTable();
		String[] columnName= { "번호", "내용", "등록일"};
		model=new DefaultTableModel(columnName, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				if(column==0||column==2) {
					return true;
				}
				return true;
			}
		};
		table.setModel(model);
		JScrollPane scroll=new JScrollPane(table);
		add(scroll, BorderLayout.CENTER);
		
		displayMemo();
		
		table.addPropertyChangeListener(this);
	}
	//여기에 displayMemo만들예정
	public void displayMemo() {
		model.setRowCount(0);
		MemoDao dao=MemoDao.getInstance();
		List<MemoDto> list=dao.getlist();
		for(int i=0; i<list.size(); i++) {
			MemoDto dto=list.get(i);
			Object[] row= {dto.getNum(), dto.getContent(), dto.getRegdate()};
			model.addRow(row);
		}
	}
	public static void main(String[] args) {
		MemoFrame a=new MemoFrame();
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setBounds(100, 100, 800, 500);
		a.setVisible(true);
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command=e.getActionCommand();
		MemoDao dao=MemoDao.getInstance();
		MemoDto dto=new MemoDto();
		if(command.equals("save")) {
			String con=imm.getText();
			dto.setContent(con);
			dao.insert(dto);
		}else if(command.equals("delete")) {
			int aa=table.getSelectedRow();
			if(aa==-1) {
				return;
			}
			int rkqt=JOptionPane.showConfirmDialog(this, "삭제?");
			if(rkqt!=0){
				return;
			}else {
			int sn=(int)model.getValueAt(aa, 0);
			dao.delete(sn);
			}
		}
		displayMemo();
	}
	boolean isEdit=false;
	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getPropertyName());
		if(arg0.getPropertyName().equals("tableCellEditor")) {
			if(isEdit) {
				int selectedIndex=table.getSelectedRow();
				int num=(int)model.getValueAt(selectedIndex, 0);
				String content=(String)model.getValueAt(selectedIndex, 1);
				MemoDto dto=new MemoDto(num, content, null);
				//DB에 저장하기
				MemoDao.getInstance().update(dto);
				isEdit=false;
			}
			isEdit=true;
		}
	}
}


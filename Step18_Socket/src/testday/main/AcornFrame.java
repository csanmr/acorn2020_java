package testday.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AcornFrame extends JFrame implements ActionListener {
	
	public AcornFrame() {
		setLayout(new BorderLayout());
		JButton testBtn=new JButton("전송");
		testBtn.setActionCommand("save");
		testBtn.addActionListener(this);
		add(testBtn, BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		AcornFrame af=new AcornFrame();
		af.setTitle("acorn");
		af.setBounds(100,100,400,400);
		af.setDefaultCloseOperation(EXIT_ON_CLOSE);
		af.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s=e.getActionCommand();
		if(s.equals("save")) {
			JOptionPane.showMessageDialog(this, "전송합니다");
		}
	}
}

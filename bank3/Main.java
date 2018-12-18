package bank3;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "0.계좌 개통\n"
					+ "0.계좌보기\n")) {
			case "0": 
				JOptionPane.showMessageDialog(null,"종료");
					return;
			case "1": 
				String id = JOptionPane.showInputDialog("ID 입력");
				String name = JOptionPane.showInputDialog("이름 등록");
				String ssn = JOptionPane.showInputDialog("주민번호 등록");
				String pass = JOptionPane.showInputDialog("비번 등록");
				member = new Member(id, name, ssn, pass);
				JOptionPane.showMessageDialog(null,member.info());
				break;
			
			}
		}
	}
}

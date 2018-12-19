package Bank4;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member = null;
		Account account = null;
		while(true) {
			
			switch(JOptionPane.showInputDialog("0.종료"
					+ "1.회원가입\n "
					+ "2.회원정보\n"
					+ "3.계좌등록\n"
					+ "4.계좌 확인\n"
					+ "5.입금\n"
					+ "6.출금\n")) {
			case "0":
				JOptionPane.showMessageDialog(null,"종료합니다");
				return;
			case "1":
				
				String id = JOptionPane.showInputDialog("ID등록\n");
				String name = JOptionPane.showInputDialog("이름 등록\n");
				String ssn = JOptionPane.showInputDialog("주민등록번호 등록\n");
				String pass= JOptionPane.showInputDialog("비밀번호 등록\n");
				member = new Member(id, name, ssn, pass);
				break;
			case "2":
				JOptionPane.showMessageDialog(null,member.info());
				break;
			case "3":

				break;
			
			
			}
		}
	}
	
}

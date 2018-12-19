package bank2;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member =null;
		Account account = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.계좌 개통\n"
					+ "3.계좌 보기\n"
					+ "4.입금\n"
					+ "5.출금\n")) {
			case"0":
				JOptionPane.showMessageDialog(null, "종료\n");
				return;
			case "1":
				String id = JOptionPane.showInputDialog("ID 등록\n");
				String name = JOptionPane.showInputDialog("이름 등록\n");
				String snn = JOptionPane.showInputDialog("주민 번호 등록\n");
				String pass = JOptionPane.showInputDialog("비번등록\n");
				member = new Member(id, name, snn, pass);
				String info = member.info();
				JOptionPane.showMessageDialog(null,info);
				break;
			case "2":
				account = new Account(0);
				break;
			case "3":
				String open = account.open(member.name);
				JOptionPane.showMessageDialog(null,open);
				break;
			case "4": 
				String deposit = JOptionPane.showInputDialog("입금액");
				String me = account.deposit(Integer.parseInt(deposit));
				JOptionPane.showMessageDialog(null,me);
				break;
			case "5":
				String withdrawal = JOptionPane.showInputDialog("출금액");
				String me2 = account.withdrawal(Integer.parseInt(withdrawal));
				JOptionPane.showMessageDialog(null,me2);
				
				break;
				
			}
		}
	}
}

package bank3;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member = null;
		Account account = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.����\n"
					+ "1.ȸ������\n"
					+ "2.���� ����\n"
					+ "3.���º���\n"
					+ "4.�Ա�"
					+ "5.���")) {
			case "0": 
				JOptionPane.showMessageDialog(null,"����");
					return;
			case "1": 
				String id = JOptionPane.showInputDialog("ID �Է�");
				String name = JOptionPane.showInputDialog("�̸� ���");
				String ssn = JOptionPane.showInputDialog("�ֹι�ȣ ���");
				String pass = JOptionPane.showInputDialog("��� ���");
				member = new Member(id, name, ssn, pass);
				String info =member.info();
				JOptionPane.showMessageDialog(null,info);
				break;
			case "2":
				account = new Account(0);
				break;
			case "3":
				String open = account.open(member.name);
				
			
				
			}
		}
	}
}

package bank2;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member =null;
		Account account2 = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.����\n"
					+ "1.ȸ������\n"
					+ "2.���� ����\n"
					+ "3.���� ����\n")) {
			case"0":
				JOptionPane.showMessageDialog(null, "����\n");
				return;
			case "1":
				String id = JOptionPane.showInputDialog("ID ���\n");
				String name = JOptionPane.showInputDialog("�̸� ���\n");
				String snn = JOptionPane.showInputDialog("�ֹ� ��ȣ ���\n");
				String pass = JOptionPane.showInputDialog("������\n");
				member = new Member(id, name, snn, pass);
				String info = member.info();
				JOptionPane.showMessageDialog(null,info);
				break;
			case "2":
				account2 = new Account(0);
				break;
			case "3":
				String open = account2.open(member.name);
				JOptionPane.showMessageDialog(null,open);
				break;
				
			}
		}
	}
}

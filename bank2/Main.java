package bank2;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member =null;
		Account account = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.����\n"
					+ "1.ȸ������\n"
					+ "2.���� ����\n"
					+ "3.���� ����\n"
					+ "4.�Ա�\n"
					+ "5.���\n")) {
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
				account = new Account(0);
				break;
			case "3":
				String open = account.open(member.name);
				JOptionPane.showMessageDialog(null,open);
				break;
			case "4": 
				String deposit = JOptionPane.showInputDialog("�Աݾ�");
				String me = account.deposit(Integer.parseInt(deposit));
				JOptionPane.showMessageDialog(null,me);
				break;
			case "5":
				String withdrawal = JOptionPane.showInputDialog("��ݾ�");
				String me2 = account.withdrawal(Integer.parseInt(withdrawal));
				JOptionPane.showMessageDialog(null,me2);
				
				break;
				
			}
		}
	}
}

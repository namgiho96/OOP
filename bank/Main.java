package bank;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Account account = null;
		Member member = null;
		while(true) {
			switch(JOptionPane.showInputDialog(
				
					"0.����\n"
					+ "1.ȸ������\n"
					+ "2.���°���\n"
					+ "3.���º���\n"
					+ "4.�Ա�\n"
					+ "5.���\n")) {
			case "0": 
				JOptionPane.showMessageDialog(null,
						"����..");
				return;
			case "1" :
				String id = JOptionPane.showInputDialog("ID �շ�");
				String name = JOptionPane.showInputDialog("�̸� ���");
				String ssn = JOptionPane.showInputDialog("�ֹι�ȣ ���");
				String pass = JOptionPane.showInputDialog("��� ���");
				 member =  new Member(id, name, ssn, pass);//�����ڰ� Ŭ�������� ������ �����ش�
				String info = member.info();
				JOptionPane.showMessageDialog(null,info);
				break;
			case "2":	
				account = new Account(0);
				break;
			case "3":
				String open = account.open(member.name);
				JOptionPane.showMessageDialog(null, open);
				break;
			case "4":
				String inputmoney = JOptionPane.showInputDialog("�Աݾ�");
				String me = account.deposit(Integer.parseInt(inputmoney));
				JOptionPane.showMessageDialog(null,me);
				break;
			case "5":
				String outputmoney = JOptionPane.showInputDialog("��ݾ�");
				String me2 = account.withdrawal(Integer.parseInt(outputmoney));
				JOptionPane.showMessageDialog(null,me2);
				}
		}
	}
}

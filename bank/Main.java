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
					+ "3.���º���\n")) {
			case "0": 
				JOptionPane.showMessageDialog(null,
						"����..");
				return;
			case "1" :
				String id = JOptionPane.showInputDialog("ID �շ�");
				String name = JOptionPane.showInputDialog("�̸� ���");
				String ssn = JOptionPane.showInputDialog("�ֹι�ȣ ���");
				String pass = JOptionPane.showInputDialog("��� ���");
				 member =  new Member(id, name, ssn, pass);
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
				
			}
		}
	}
}

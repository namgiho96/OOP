package bank3;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.����\n"
					+ "1.ȸ������\n"
					+ "0.���� ����\n"
					+ "0.���º���\n")) {
			case "0": 
				JOptionPane.showMessageDialog(null,"����");
					return;
			case "1": 
				String id = JOptionPane.showInputDialog("ID �Է�");
				String name = JOptionPane.showInputDialog("�̸� ���");
				String ssn = JOptionPane.showInputDialog("�ֹι�ȣ ���");
				String pass = JOptionPane.showInputDialog("��� ���");
				member = new Member(id, name, ssn, pass);
				JOptionPane.showMessageDialog(null,member.info());
				break;
			
			}
		}
	}
}

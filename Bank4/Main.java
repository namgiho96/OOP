package Bank4;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Member member = null;
		Account account = null;
		while(true) {
			
			switch(JOptionPane.showInputDialog("0.����"
					+ "1.ȸ������\n "
					+ "2.ȸ������\n"
					+ "3.���µ��\n"
					+ "4.���� Ȯ��\n"
					+ "5.�Ա�\n"
					+ "6.���\n")) {
			case "0":
				JOptionPane.showMessageDialog(null,"�����մϴ�");
				return;
			case "1":
				
				String id = JOptionPane.showInputDialog("ID���\n");
				String name = JOptionPane.showInputDialog("�̸� ���\n");
				String ssn = JOptionPane.showInputDialog("�ֹε�Ϲ�ȣ ���\n");
				String pass= JOptionPane.showInputDialog("��й�ȣ ���\n");
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

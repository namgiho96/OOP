package bank11;

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
					+ "5.���\n"
					+ "6.�������\n"
					+ "7.ȸ������")) {
			case "0": 
				JOptionPane.showMessageDialog(null,
						"����..");
				return;
			case "1" :
				String id = JOptionPane.showInputDialog("ID �շ�");
				String name = JOptionPane.showInputDialog("�̸� ���");
				String ssn = JOptionPane.showInputDialog("�ֹι�ȣ ���");
				String pass1 = JOptionPane.showInputDialog("��� ���");
				 member =  new Member(id, name, ssn, pass1);//�����ڰ� Ŭ�������� ������ �����ش�
				String info = member.toString();
				JOptionPane.showMessageDialog(null,info);
				break;
			case "2":	
				account = new Account(0);
				break;
			case "3":
				String open = account.toString();
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
			case "6":
				String pass =  JOptionPane.showInputDialog("��й�ȣ�� �����ϼ���");
				member.setPass(pass);
				JOptionPane.showMessageDialog(null,pass);
				break;
			case "7":
				String info1 = member.toString();
				JOptionPane.showMessageDialog(null,info1);
				break;
				}
		}
	}
}

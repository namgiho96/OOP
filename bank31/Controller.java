package bank31;

import javax.swing.JOptionPane;

import bank3.Member;

public class Controller {
	public static void main(String[] args) {
		AccountBean account = null;
		MemberBaen member = null;
		AccountService service = new AccountServiesImpl();
		MemberService memberService = new MemberServiceImpl();
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
				member = memberService.join(JOptionPane.showInputDialog("ID �շ�"),
						JOptionPane.showInputDialog("�̸� ���"),
						JOptionPane.showInputDialog("�ֹι�ȣ ���"),
						JOptionPane.showInputDialog("��� ���"));
				break;
			case "2":	
				account = new AccountBean();
				String accountNum = service.generatorAccountNum();
				account.setAccountNum(accountNum);
				String today = service.today();
				account.setToday(today);
				String smoney = JOptionPane.showInputDialog("�Ա�");
				int imoney = Integer.parseInt(smoney);
				account.setMoney(imoney);
				String info2 = service.info(account.getAccountNum(),
						member.getName(),
						account.getToday(),
						account.getMoney());
				JOptionPane.showMessageDialog(null,info2);
				break;
			case "3":
				String open = account.toString();
				JOptionPane.showMessageDialog(null, open);
				break;
			case "4":
				//String inputmoney = JOptionPane.showInputDialog("�Աݾ�");
				//String me = account.deposit(Integer.parseInt(inputmoney));
				//JOptionPane.showMessageDialog(null,me);
				break;
			case "5":
				//String outputmoney = JOptionPane.showInputDialog("��ݾ�");
				//String me2 = account.withdrawal(Integer.parseInt(outputmoney));
				//JOptionPane.showMessageDialog(null,me2);
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

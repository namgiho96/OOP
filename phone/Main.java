package phone;

import javax.swing.JOptionPane;


public class Main {
	public static void main(String[] args) {
		PhoneBean ph = null;
		CelPhoneBean cel = null;
		IPhoneBean iph = null;
		AndroudPhoneBean andph = null;
	
		while(true) {
			switch(JOptionPane.showInputDialog(
					"0.����\n"
					+ "1.�Ϲ���\n"
					+ "2.�޴���\n"
					+ "3.������\n"
					+ "4.�ȵ���̵�\n"
					+ "5.\n"
					+ "6.\n"
					+ "7.\n"
					+ "")) {
				case "0":
					JOptionPane.showMessageDialog(null,
							"���� ..");
					return;
				case "1":
					ph = new PhoneBean();
					String kind = JOptionPane.showInputDialog("��ȭ������");
					String company = JOptionPane.showInputDialog("���ȸ����ǰ");//�ݼ�
					String call = JOptionPane.showInputDialog("��ȭ����");//�ȳ�
					ph.setKind(kind);
					ph.setCompany(company);
					ph.setCall(call);
					JOptionPane.showMessageDialog(null,ph.toString());
					
					break;
				case "2":
					cel = new CelPhoneBean();
					String kind2 = JOptionPane.showInputDialog("��ȭ������");
					String company2 = JOptionPane.showInputDialog("���ȸ����ǰ");
					String move = JOptionPane.showInputDialog("�̵����ɿ���");
					String call2 = JOptionPane.showInputDialog("��ȭ����");//�ȳ�
					cel.setKind(kind2);
					cel.setCompany(company2);
					cel.setMove(move);
					cel.setCall(call2);
					JOptionPane.showMessageDialog(null,cel.toString());
					break;
				case "3":
					iph = new IPhoneBean();
					kind = JOptionPane.showInputDialog("��ȭ������");
					company = JOptionPane.showInputDialog("���ȸ����ǰ");
					move = JOptionPane.showInputDialog("�̵����ɿ���");
					call = JOptionPane.showInputDialog("��ȭ����");//�ȳ�
					String date = JOptionPane.showInputDialog("�˻�");
					iph.setKind(kind);
					iph.setCompany(company);
					iph.setMove(move);
					iph.setCall(call);
					iph.setDate(date);
					JOptionPane.showMessageDialog(null,iph.toString());
					// ���� : ������
					// ������ :����
					// �̵��� :�̵� ������
					// �˻� :�뷡 �˻�
					break;
				case "4":
					andph = new AndroudPhoneBean();
					kind = JOptionPane.showInputDialog("��ȭ������");
					company = JOptionPane.showInputDialog("���ȸ����ǰ");
					move = JOptionPane.showInputDialog("�̵����ɿ���");
					call = JOptionPane.showInputDialog("��ȭ����");//�ȳ�
					String display = JOptionPane.showInputDialog("����ġ");
					date = JOptionPane.showInputDialog("�˻�");
					andph.setKind(kind);
					andph.setCompany(company);
					andph.setMove(move);
					andph.setCall(call);
					andph.setDisplay(display);
					andph.setDate(date);
					JOptionPane.showMessageDialog(null,andph.toString());
					break;
			}
		}
	}
}


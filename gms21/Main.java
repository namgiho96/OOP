package gms21;

import javax.swing.JOptionPane;

public class Main {
 public static void main(String[] args) {
	 Studentbean studentbean = null;
	 StudentbeenService service = null;
	 Subjectbean subjectbean  = null;
	 SubjectService service2 = null;
	while(true) {
		/**
		 * ����ǥ�� ǥ�õ� ����
		 * �й�(student)
		 * �л��̸�(student)
		 * �����(subject)
		 * ����(subject)
		 * 
		 * */
		
		switch(JOptionPane.showInputDialog("0.����"
				+ "1.�л��� ���\n"
				+ "2.��й�ȣ ����\n"
				+ "3,�л���������\n"
				+ "4.��������,����,����\n"
				+ "5.����ǥ ����\n"
				
				)) {
			case "0":
				JOptionPane.showMessageDialog(null,"�����մϴ�");
				return;
			case "1":
				service = new StudentbeenService();
				
				String name =	JOptionPane.showInputDialog("�л��̸�");
				String ssn	=	JOptionPane.showInputDialog("�ֹε�Ϲ�ȣ");
				String pass =	JOptionPane.showInputDialog("��й�ȣ ");
				studentbean = new Studentbean();
				studentbean.setName(name);
				studentbean.setSsn(ssn);
				studentbean.setPass(pass);
				studentbean.setHakbun(service.hakbun());
				break;
			case "2":
				String pass1  = JOptionPane.showInputDialog("��й�ȣ�� �����Ͻÿ�");
				JOptionPane.showMessageDialog(null,studentbean.getPass());
				break;
			case "3":
				JOptionPane.showMessageDialog(null,
						studentbean.toString());
				break;
			case "4":
				subjectbean = new Subjectbean();
				String subject = JOptionPane.showInputDialog("������ �Է��ϼ���");
				String profName = JOptionPane.showInputDialog("����");
				String score = JOptionPane.showInputDialog("����");
				subjectbean.setSubjName(subject);
				subjectbean.setProfName(profName);
				subjectbean.setScore(Integer.parseInt(score));
				break;
			case "5":
				service2 = new SubjectService();
				
				
				String res =  service2.res(studentbean.getHakbun(),
						studentbean.getNamea(),
						subjectbean.getSubjName(),
						subjectbean.getScore());
				JOptionPane.showMessageDialog(null,res);
				break;
		}
	}
}
}

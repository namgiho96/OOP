package card;

import javax.swing.JOptionPane;

import car.Carbean;

public class Main {
	public static void main(String[] args) {
		Cardbean carbean = null;
		
		while(true) {
			switch(JOptionPane.showInputDialog(
				
					"0.����\n"
					+ "1.ī�弱��\n"
					+ "2.ī������\n"
					)) {
			case "0": 
				JOptionPane.showMessageDialog(null,
						"����..");
				return;
			case "1" :
				carbean = new Cardbean();
				String kind = JOptionPane.showInputDialog("ī���Է�");
				String number = JOptionPane.showInputDialog("ī���ȣ");
				carbean.setKind(kind);
				carbean.setNumber(Integer.parseInt(number));
				break;
			case "2":
				JOptionPane.showMessageDialog(null,carbean.toString());
				// ������ ī���� ����
				break;
			}
		}
	
	}
}


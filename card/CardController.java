package card;

import javax.swing.JOptionPane;

public class CardController {
	private static String bet;

	public static void main(String[] args) {
		Cardbean carbean = null;
		CardServise servise = new CardServiseImpl();
		while(true) {
			switch(JOptionPane.showInputDialog(
				
					"0.����\n"
					+ "1.����"
					+ "2.ī������\n"
					)) {
			case "0": 
				JOptionPane.showMessageDialog(null,
						"����..");
				return;
			case "1" :
				
				String kind = JOptionPane.showInputDialog("ī���� ����");
				String number = JOptionPane.showInputDialog("ī���� ����");
				String bet = JOptionPane.showInputDialog("�󸶸� ������ �ǰ���?");
				servise.bet(Integer.parseInt(bet));
				break;
			case "2":
				JOptionPane.showMessageDialog(null,carbean.toString());
				// ������ ī���� ����
				break;
			}
		}
	
	}
}


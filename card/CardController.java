package card;

import javax.swing.JOptionPane;

public class CardController {
	private static String bet;

	public static void main(String[] args) {
		Cardbean carbean = null;
		CardServise servise = new CardServiseImpl();
		while(true) {
			switch(JOptionPane.showInputDialog(
				
					"0.종료\n"
					+ "1.배팅"
					+ "2.카드정보\n"
					)) {
			case "0": 
				JOptionPane.showMessageDialog(null,
						"종료..");
				return;
			case "1" :
				
				String kind = JOptionPane.showInputDialog("카드의 종류");
				String number = JOptionPane.showInputDialog("카드의 숫자");
				String bet = JOptionPane.showInputDialog("얼마를 배팅할 건가요?");
				servise.bet(Integer.parseInt(bet));
				break;
			case "2":
				JOptionPane.showMessageDialog(null,carbean.toString());
				// 제출한 카드의 스펙
				break;
			}
		}
	
	}
}


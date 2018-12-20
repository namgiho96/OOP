package card;

import javax.swing.JOptionPane;

import car.Carbean;

public class Main {
	public static void main(String[] args) {
		Cardbean carbean = null;
		
		while(true) {
			switch(JOptionPane.showInputDialog(
				
					"0.종료\n"
					+ "1.카드선택\n"
					+ "2.카드정보\n"
					)) {
			case "0": 
				JOptionPane.showMessageDialog(null,
						"종료..");
				return;
			case "1" :
				carbean = new Cardbean();
				String kind = JOptionPane.showInputDialog("카드입력");
				String number = JOptionPane.showInputDialog("카드번호");
				carbean.setKind(kind);
				carbean.setNumber(Integer.parseInt(number));
				break;
			case "2":
				JOptionPane.showMessageDialog(null,carbean.toString());
				// 제출한 카드의 스펙
				break;
			}
		}
	
	}
}


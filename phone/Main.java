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
					"0.종료\n"
					+ "1.일반폰\n"
					+ "2.휴대폰\n"
					+ "3.아이폰\n"
					+ "4.안드로이드\n"
					+ "5.\n"
					+ "6.\n"
					+ "7.\n"
					+ "")) {
				case "0":
					JOptionPane.showMessageDialog(null,
							"종료 ..");
					return;
				case "1":
					ph = new PhoneBean();
					String kind = JOptionPane.showInputDialog("전화기종류");
					String company = JOptionPane.showInputDialog("어느회사제품");//금성
					String call = JOptionPane.showInputDialog("통화내용");//안녕
					ph.setKind(kind);
					ph.setCompany(company);
					ph.setCall(call);
					JOptionPane.showMessageDialog(null,ph.toString());
					
					break;
				case "2":
					cel = new CelPhoneBean();
					String kind2 = JOptionPane.showInputDialog("전화기종류");
					String company2 = JOptionPane.showInputDialog("어느회사제품");
					String move = JOptionPane.showInputDialog("이동가능여부");
					String call2 = JOptionPane.showInputDialog("통화내용");//안녕
					cel.setKind(kind2);
					cel.setCompany(company2);
					cel.setMove(move);
					cel.setCall(call2);
					JOptionPane.showMessageDialog(null,cel.toString());
					break;
				case "3":
					iph = new IPhoneBean();
					kind = JOptionPane.showInputDialog("전화기종류");
					company = JOptionPane.showInputDialog("어느회사제품");
					move = JOptionPane.showInputDialog("이동가능여부");
					call = JOptionPane.showInputDialog("통화내용");//안녕
					String date = JOptionPane.showInputDialog("검색");
					iph.setKind(kind);
					iph.setCompany(company);
					iph.setMove(move);
					iph.setCall(call);
					iph.setDate(date);
					JOptionPane.showMessageDialog(null,iph.toString());
					// 종류 : 아이폰
					// 제조사 :애플
					// 이동성 :이동 가능함
					// 검색 :노래 검색
					break;
				case "4":
					andph = new AndroudPhoneBean();
					kind = JOptionPane.showInputDialog("전화기종류");
					company = JOptionPane.showInputDialog("어느회사제품");
					move = JOptionPane.showInputDialog("이동가능여부");
					call = JOptionPane.showInputDialog("통화내용");//안녕
					String display = JOptionPane.showInputDialog("몇인치");
					date = JOptionPane.showInputDialog("검색");
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


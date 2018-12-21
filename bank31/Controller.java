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
				
					"0.종료\n"
					+ "1.회원가입\n"
					+ "2.계좌개통\n"
					+ "3.계좌보기\n"
					+ "4.입금\n"
					+ "5.출금\n"
					+ "6.비번변경\n"
					+ "7.회원정보")) {
			case "0": 
				JOptionPane.showMessageDialog(null,
						"종료..");
				return;
			case "1" :
				member = memberService.join(JOptionPane.showInputDialog("ID 둥록"),
						JOptionPane.showInputDialog("이름 등록"),
						JOptionPane.showInputDialog("주민번호 등록"),
						JOptionPane.showInputDialog("비번 등록"));
				break;
			case "2":	
				account = new AccountBean();
				String accountNum = service.generatorAccountNum();
				account.setAccountNum(accountNum);
				String today = service.today();
				account.setToday(today);
				String smoney = JOptionPane.showInputDialog("입금");
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
				//String inputmoney = JOptionPane.showInputDialog("입금액");
				//String me = account.deposit(Integer.parseInt(inputmoney));
				//JOptionPane.showMessageDialog(null,me);
				break;
			case "5":
				//String outputmoney = JOptionPane.showInputDialog("출금액");
				//String me2 = account.withdrawal(Integer.parseInt(outputmoney));
				//JOptionPane.showMessageDialog(null,me2);
			case "6":
				String pass =  JOptionPane.showInputDialog("비밀번호를 변경하세요");
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

package bank3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Account {
	final static String BANK_NAME ="��������";
	String accountNum,bankName;
	int money;
	String today;
	
	public Account(int money) {
		this.accountNum = this.generatirAccountNum();
		this.money = money;
		//this.today = this.today();
	}
	
	public String generatirAccountNum() {
		String account = "";
		Random random = new Random();
		for(int i=0;i<9;i++) {
			if(i==3) {
				account += random.nextInt(9)+"";
			}else {
				account += random.nextInt(9)+"";
			}
		}
				return account;
		
	}
	public String today() {
		Date date = new Date();
		String res ="";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
		
		return res;
	}
	public String open(String name) {
		return String.format("�����̸�%s"
				+ "���¹�ȣs\n"
				+ "�� ��:%s\n"
				+ "�� ¥:%s\n"
				+ "�ܾ�%s\n"
				,BANK_NAME,accountNum,name,today,money);
	}
		
}
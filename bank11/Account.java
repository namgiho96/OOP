package bank11;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Random;

	public class Account {
	public final static String BANK_NAME = "��������";
	 private String accountNum,today;
	 private int money;
	
	
	Account(int money){
		this.accountNum = this.generatorAccountNum();
		this.money = money;
		this.today = this.today();
	}
	public String getAccountNum() {
		return  accountNum;
	}
	public String getToday() {
		return  today;
	}
	public int getMoney() {
		return  money;
	}
	public int setaMoney(int money) {
		return money;
	}
public String  generatorAccountNum() {
	String account = "";
	Random random = new Random();
	for(int i =0;i<9;i++) {
		if(i==3) {
			account += random.nextInt(9)+"-";
		}else {
			account += random.nextInt(9);			
		}
	}
							return account;
}
public String today() {
	Date date =  new Date();
	SimpleDateFormat dateFormat =  new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
	return dateFormat.format(date);
}
/**
 * ����ϱ�
 * */
	public String withdrawal(int out) {
		String messge ="";
		if(this.money>=out&&out>0){
			this.money -= out;	
			messge = "�ŷ��Ϸ�";
		}else {
			 messge = "�Աݾ��� �߸��Ǿ��ų� �ܰ� �����մϴ�";
		}
		return messge;
	}			
/**
 * �Ա��ϱ�
 * */
	public String deposit(int in) {
		String messge ="";
		if(in>0) {
			this.money += in;	
			messge = "�ŷ��Ϸ�";
		}else {
			messge = "�ŷ��� �ȵ˴ϴ�";
		}
		return messge;
		
		
			
}
	
public String toString() {
	
	return String.format("�����̸�%s\n"
			+ "���¹�ȣ %s\n"
			+ "�� �� :%s \n"
			+ "�� ¥ %s \n"
			+ "�ܾ�:%s \n",BANK_NAME,accountNum,today,money);
	
} 		
	}


package bank;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Random;

	public class Account {
	final static String BANK_NAME = "��������";
	String accountNUM,bankName;
	int money;
	String today;
	
	Account(int money){
		this.accountNUM = this.generatorAccountNum();
		this.money = money;
		this.today = this.today();
	}
	
	
public String  generatorAccountNum() {
	String account = "";
	Random random = new Random();
	for(int i =0;i<9;i++) {
		if(i==3) {
		account += random.nextInt(9)+"";
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
	
public String open(String name) {
	
	return String.format("�����̸�%s\n"
			+ "���¹�ȣ %s\n"
			+ "�� �� :%s \n"
			+ "�� ¥ %s \n"
			+ "�ܾ�:%s \n",BANK_NAME,accountNUM,name,today,money);
	
} 		
	}


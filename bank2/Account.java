package bank2;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Account {
	final static String BANK_NAME = "국민은행";
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

public String deposit(int in) {
	String message = "";
	if(in >0) {
		this.money += in;
		message = "거래완료";
	}else {
		message = "잘못입력하셧습니다";
	}
	return message;
} 
public String withdrawal(int out) {
	String message = "";
	if(this.money>=out&&out>0) {
		this.money -= out;
		message = "거래완료";
	}else {
		message = "잔액이 없습니다";
	}
	return message;
}
	
public String open(String name) {
	
	return String.format("은행이름%s\n"
			+ "계좌번호 %s\n"
			+ "이 름 :%s \n"
			+ "날 짜 %s \n"
			+ "잔액:%s \n",BANK_NAME,accountNUM,name,today,money);
	
} 		
	}


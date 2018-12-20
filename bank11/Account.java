package bank11;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Random;

	public class Account {
	public final static String BANK_NAME = "국민은행";
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
 * 출금하기
 * */
	public String withdrawal(int out) {
		String messge ="";
		if(this.money>=out&&out>0){
			this.money -= out;	
			messge = "거래완료";
		}else {
			 messge = "입금액이 잘못되었거나 잔고가 부족합니다";
		}
		return messge;
	}			
/**
 * 입금하기
 * */
	public String deposit(int in) {
		String messge ="";
		if(in>0) {
			this.money += in;	
			messge = "거래완료";
		}else {
			messge = "거래가 안됩니다";
		}
		return messge;
		
		
			
}
	
public String toString() {
	
	return String.format("은행이름%s\n"
			+ "계좌번호 %s\n"
			+ "이 름 :%s \n"
			+ "날 짜 %s \n"
			+ "잔액:%s \n",BANK_NAME,accountNum,today,money);
	
} 		
	}


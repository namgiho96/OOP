package bank21;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Random;

	public class AccountBean {
	public final static String BANK_NAME = "±¹¹ÎÀºÇà";
	 private String accountNum,today;
	 private int money;
	
	public String getAccountNum() {
		return  accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getToday() {
		return  today;
	}
	public void setToday(String today) {
		this.today =  today;
	}
	public int getMoney() {
		return  money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

		
		
			

	
public String toString() {
	
	return String.format(
			"°èÁÂ¹øÈ£ %s\n"
			+ "³¯ Â¥ %s \n"
			+ "ÀÜ¾×:%s \n",accountNum,today,money);
	
} 		
	}


package bank21;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
public class AccountService {
	//서비스 로직에는 맴버변수를 두지 않는다
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
	
	public String info(String accountNum,
						String name,
						String today,
						int money) {
		 return String.format("은행이름%s\n"
					+ "계좌번호 %s\n"
					+ "이 름 :%s \n"
					+ "날 짜 %s \n"
					+ "잔액:%s \n",AccountBean.BANK_NAME,// 상수는 클래스이름.상수이름
					accountNum,name,today,money);
	}
	/**
	 * 출금하기
	 * */
		/*public String withdrawal(int out) {
			String messge ="";
			if(this.money>=out&&out>0){
				this.money -= out;	
				messge = "거래완료";
			}else {
				 messge = "입금액이 잘못되었거나 잔고가 부족합니다";
			}
			return messge;*/
		
	/**
	 * 입금하기
	 * */
		/*public String deposit(int in)  {
			String messge ="";
			if(in>0) {
				this.money += in;	
				messge = "거래완료";
			}else {
				messge = "거래가 안됩니다";
			}
			return messge;*/
}

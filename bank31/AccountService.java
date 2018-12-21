package bank31;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
public interface AccountService {
	//서비스 로직에는 맴버변수를 두지 않는다
	public String  generatorAccountNum();
	/*
	 *오늘날짜구하기 
	 * */
	public String today();
	/*
	 * 오늘 날짜 구하기 
	 * **/
	
	public String info(String accountNum,
						String name,
						String today,
						int money);

		public String withdrawal(int out);
			
	
		public String deposit(int in);
}
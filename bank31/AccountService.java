package bank31;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
public interface AccountService {
	//���� �������� �ɹ������� ���� �ʴ´�
	public String  generatorAccountNum();
	/*
	 *���ó�¥���ϱ� 
	 * */
	public String today();
	/*
	 * ���� ��¥ ���ϱ� 
	 * **/
	
	public String info(String accountNum,
						String name,
						String today,
						int money);

		public String withdrawal(int out);
			
	
		public String deposit(int in);
}
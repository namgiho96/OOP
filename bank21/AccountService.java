package bank21;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
public class AccountService {
	//���� �������� �ɹ������� ���� �ʴ´�
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
		 return String.format("�����̸�%s\n"
					+ "���¹�ȣ %s\n"
					+ "�� �� :%s \n"
					+ "�� ¥ %s \n"
					+ "�ܾ�:%s \n",AccountBean.BANK_NAME,// ����� Ŭ�����̸�.����̸�
					accountNum,name,today,money);
	}
	/**
	 * ����ϱ�
	 * */
		/*public String withdrawal(int out) {
			String messge ="";
			if(this.money>=out&&out>0){
				this.money -= out;	
				messge = "�ŷ��Ϸ�";
			}else {
				 messge = "�Աݾ��� �߸��Ǿ��ų� �ܰ� �����մϴ�";
			}
			return messge;*/
		
	/**
	 * �Ա��ϱ�
	 * */
		/*public String deposit(int in)  {
			String messge ="";
			if(in>0) {
				this.money += in;	
				messge = "�ŷ��Ϸ�";
			}else {
				messge = "�ŷ��� �ȵ˴ϴ�";
			}
			return messge;*/
}

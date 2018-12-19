package Bank4;

import java.util.Random;

public class Account {
  String accountNum,today;
  int money;
   Account(String accountNum,
		   String today,
		   int money
		   			) {
	   			this.accountNum = generatorAccountNum();
	   			this.today = today;
	   			this.money = money;
}
  public String generatorAccountNum() {
	  String accountNum = "";
		Random random = new Random();
		for(int i =0;i<9;i++) {
			if(i==3) {
			accountNum += random.nextInt(9)+"";
			}else {
				accountNum += random.nextInt(9);			
			}
		}
			
	  return accountNum;
  }
  public String today() {
	  String today = "";
	  return today;
  }
  public String deposit() {
	  String deposit = "";
	  return deposit;
  }
  public String withdrawal() {
	  String withdrawal = "";
	  return withdrawal;
  }
  
  public String info() {
	  
	  
	  return String.format("");
  }
}

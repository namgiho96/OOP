package bank;

public class Member {
	String id,name,ssn,pass;
	
	
	 Member(String id,
			String name,
			String ssn,
			String pass) {
		 
		 this.id = id;
		 this.name = name;
		 this.ssn = ssn;
		 this.pass = pass;
		
	}
	 public String info() {
		
		 
		 return String.format("[ȸ������]\n"
		 		+ "id: %s\n"
		 		+ "�̸�: %s\n"
		 		+ "�ֹι�ȣ %s\n"
		 		+ "��й�ȣ %s\n",id,name,ssn,pass);
	 }
}

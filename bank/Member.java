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
		 		+ "�̸�: %s"
		 		+ "�ֹι�ȣ %s"
		 		+ "��й�ȣ %s",id,name,ssn,pass);
	 }
}

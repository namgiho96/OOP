package bank3;

public class Member {
	String id,name,ssn,pass;
	
	public Member(String id,
				  String name,
				  String ssn,
				  String pass) {
		this.id = id ;
		this.name = name ;
		this.ssn = ssn ;
		this.pass = pass ;
	}
	public String info() {
		
		return String.format("[ȸ������]\n"
				+ "[ȸ������]\n"
				+ "[�̸�]\n"
				+ "[�ֹι�ȣ]\n"
				+ "[��й�ȣ]\n",id,name,ssn,pass);
	}
}

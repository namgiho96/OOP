package gms21;

public class Studentbean {
	
	private String hakbun,name,ssn,pass;
	
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun ) {
		this.hakbun = hakbun;
	}
	public String getNamea() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn =  ssn;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass() {
		return pass;
	}
	
	public String toString() {
		
		return String.format("�й� :%s\n"
				+ "�̸� :%s\n"
				+ "�ֹε�Ϲ�ȣ :%s\n"
				+ "��й�ȣ%s\n",hakbun,name,ssn,pass);
	}
	
	
}

	


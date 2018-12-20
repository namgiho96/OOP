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
		
		return String.format("학번 :%s\n"
				+ "이름 :%s\n"
				+ "주민등록번호 :%s\n"
				+ "비밀번호%s\n",hakbun,name,ssn,pass);
	}
	
	
}

	


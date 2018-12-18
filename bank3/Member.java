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
		
		return String.format("[회원가입]\n"
				+ "[회원가입]\n"
				+ "[이름]\n"
				+ "[주민번호]\n"
				+ "[비밀번호]\n",id,name,ssn,pass);
	}
}

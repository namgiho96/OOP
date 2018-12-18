package bank2;


public class Member {
	String id,name,snn,pass;
	
	Member(String id,String name,String snn,String pass){
		
		this.id = id;
		this.name = name;
		this.snn = snn;
		this.pass = pass;
	}
	public String info() {
		return String.format("회원정지\n"
				+ "ID:%s \n"
				+ "이름 %s\n"
				+ "주민번호%s \n"
				+ "비밀번호%s \n", id,name,snn,pass);
	}
		
	}


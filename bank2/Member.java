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
		return String.format("ȸ������\n"
				+ "ID:%s \n"
				+ "�̸� %s\n"
				+ "�ֹι�ȣ%s \n"
				+ "��й�ȣ%s \n", id,name,snn,pass);
	}
		
	}


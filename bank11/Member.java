package bank11;
public class Member {
	private	String id,name,ssn,pass;
	
	
	public Member(String id,
			String name,
			String ssn,
			String pass) {
		 this.id = id;
		 this.name = name;
		 this.ssn = ssn;
		 this.pass = pass;
		
	}
	public void setPass(String pass) {
		 this.pass = pass;
	 }
	 public String getPass(String pass) {
		 return this.pass = pass;
	 }
	 public void getSsn(String ssn) {
		 this.ssn = ssn;
	 }
	 public void getId(String id) {
		 this.id = id;
	 }
	 public void setName(String name) {//����  write ���°�
		 this.name = name;
	 }
	 public String getName() {//����
		return this.name; // read �д°� 
	 }
	 public String toString() {
		 return String.format("[ȸ������]\n"
		 		+ "id: %s\n"
		 		+ "�̸�: %s\n"
		 		+ "�ֹι�ȣ %s\n"
		 		+ "��й�ȣ %s\n",id,name,ssn,pass);
	 }
}

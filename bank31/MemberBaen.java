package bank31;
public class MemberBaen {
	private	String id,name,ssn,pass;
	
	
	public MemberBaen(String id,
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
	 public String getPass() {
		 return  pass;
	 }
	 public void setSsn(String ssn) {
		this.ssn = ssn;
	 }
	 public String getSsn() {
		 return ssn;
	 }
	 public void setId(String id) {
		   this.id = id;
	 }
	 public String getId() {
		 return  id;
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

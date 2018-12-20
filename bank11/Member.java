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
	 public void setName(String name) {//세터  write 쓰는거
		 this.name = name;
	 }
	 public String getName() {//게터
		return this.name; // read 읽는거 
	 }
	 public String toString() {
		 return String.format("[회원정저]\n"
		 		+ "id: %s\n"
		 		+ "이름: %s\n"
		 		+ "주민번호 %s\n"
		 		+ "비밀번호 %s\n",id,name,ssn,pass);
	 }
}

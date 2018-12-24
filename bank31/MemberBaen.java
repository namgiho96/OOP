package bank31;
public class MemberBaen {
	private	String id,name,ssn,pass;
	
	
	
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

package Bank4;

public class Member {
	String id,name,ssn,pass; //인스턴스 변수
	public Member(String id,String name,String ssn,String pass) {//맴버변수를 초기화 시켜준다 지역변수
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	}
	/*
	회원정보 보여주기
	 * */
	public String info() {
		
		
		return String.format("ID%s\n"
				+ "이름 :%s\n"
				+ "주민등록번호:%s\n"
				+ "비밀번호 :%s\n",id,name,ssn,pass) ;
	}
	
}

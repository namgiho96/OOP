package bank31;

public interface MemberService {
	//회원가입
	public MemberBaen join(String id,String name,String ssn,String pass1);
	// 로그인
	public MemberBaen login(String id,String pass1); 
	//정보수정
	public void update(); 
	//회원탈퇴
	public void delete(); 
	
}

package bank31;

public interface MemberService {
	//회원가입
	public void join(String id,String name,String ssn,String pass1);
	//================================================================
	//목록보기
	public MemberBaen[] list();
	//개인 정보 검색
	public  MemberBaen find(String id);
	// 로그인
	public boolean login(String id , String pw); 
	// 회원수
	public int count();
	//=====================================================================
	//정보수정
	public void update(String pass,String id,String newpw); 
	//회원탈퇴
	public void delete(); 
	
}

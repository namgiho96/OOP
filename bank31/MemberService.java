package bank31;

public interface MemberService {
	//ȸ������
	public MemberBaen join(String id,String name,String ssn,String pass1);
	// �α���
	public MemberBaen login(String id,String pass1); 
	//��������
	public void update(); 
	//ȸ��Ż��
	public void delete(); 
	
}

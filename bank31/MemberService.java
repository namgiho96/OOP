package bank31;

public interface MemberService {
	//ȸ������
	public void join(String id,String name,String ssn,String pass1);
	//================================================================
	//��Ϻ���
	public MemberBaen[] list();
	//���� ���� �˻�
	public  MemberBaen find(String id);
	// �α���
	public boolean login(String id , String pw); 
	// ȸ����
	public int count();
	//=====================================================================
	//��������
	public void update(String pass,String id,String newpw); 
	//ȸ��Ż��
	public void delete(); 
	
}

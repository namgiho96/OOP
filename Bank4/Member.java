package Bank4;

public class Member {
	String id,name,ssn,pass; //�ν��Ͻ� ����
	public Member(String id,String name,String ssn,String pass) {//�ɹ������� �ʱ�ȭ �����ش� ��������
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	}
	/*
	ȸ������ �����ֱ�
	 * */
	public String info() {
		
		
		return String.format("ID%s\n"
				+ "�̸� :%s\n"
				+ "�ֹε�Ϲ�ȣ:%s\n"
				+ "��й�ȣ :%s\n",id,name,ssn,pass) ;
	}
	
}

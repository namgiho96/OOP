package phone;
/**
 * company ������
 * call ��ȭ
 * kind �Ϲ���ȭ��
 * */
public class PhoneBean {
	private String kind,company,call;
	
	public void setKind(String kind ) {
		this.kind = kind;
	}
	public void setCompany(String company ) {
		this.company = company;
	}
	public void setCall(String call ) {
		this.call = call;
	}
	
	public String getKind() {
		return kind;
	}
	public String getCompany() {
		return company;
	}
	public String getCall() {
		return call;
	}
	
	
	
	
	@Override
		public String toString() {
			return String.format("��ȭ�� ����: %s\n"
					+ "������ %s\n"
					+ "��ȭ����: %s", kind,company,call);
			
		}
	
}

package phone;

public class  IPhoneBean extends CelPhoneBean {
	private String date;
	
	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	
	@Override
	public String toString() {
		return String.format("��ȭ�� ����: %s\n"
				+ "������: %s\n"
				+ "�̵�����%s\n"
				+ "�˻�: %s\n"
				+ "ūȭ�� :%s\n",
				getKind(),
				getCompany(),
				getMove(),
				date);
	
}
}

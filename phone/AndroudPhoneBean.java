package phone;

public class AndroudPhoneBean extends IPhoneBean {
	private String dispalay;
	
	public void setDisplay(String display) {
		this.dispalay = display;
	}
	public String getDisplay() {
		return dispalay;
	}
	@Override
	public String toString() {
		return String.format("��ȭ�� ����: %s\n"
				+ "������: %s\n"
				+ "�̵�����%s\n"
				+ "��ȭ����: %s\n"
				+ "�˻� :%s\n"
				+ "ūȭ��: %s\n",
				getKind(),
				getCompany(),
				getMove(),
				getCall(),
				getDate(),
				dispalay);
	
}
	
	
}

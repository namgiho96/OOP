package phone;

public class CelPhoneBean extends PhoneBean{
	
	
	private String move; // �̵� ������
	
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	
	@Override
	public String toString() {
		return String.format("��ȭ�� ����: %s\n"
				+ "������: %s\n"
				+ "�̵�����%s\n"
				+ "��ȭ����: %s",
				getKind(),
				getCompany(),
				move,
				getCall());
	}
}

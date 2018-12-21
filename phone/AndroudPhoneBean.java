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
		return String.format("전화기 종류: %s\n"
				+ "제조사: %s\n"
				+ "이동가능%s\n"
				+ "통화내용: %s\n"
				+ "검색 :%s\n"
				+ "큰화면: %s\n",
				getKind(),
				getCompany(),
				getMove(),
				getCall(),
				getDate(),
				dispalay);
	
}
	
	
}

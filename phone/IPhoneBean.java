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
		return String.format("전화기 종류: %s\n"
				+ "제조사: %s\n"
				+ "이동가능%s\n"
				+ "검색: %s\n"
				+ "큰화면 :%s\n",
				getKind(),
				getCompany(),
				getMove(),
				date);
	
}
}

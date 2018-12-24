package card; 

public class Cardbean {
	private String kind; 
	private int number;
	
	public String getKind() {
		return kind;
	}
	public int getNumber() {
		return number;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString() {
		return String.format("카드종류 :%s\n"
				+ "카드번호 :%d", kind,number);
	}
	
}

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
		return String.format("ī������ :%s\n"
				+ "ī���ȣ :%d", kind,number);
	}
	
}

package car;
public class CarBean {
	private String color, gearType;
	private int door; // ���� ����
	
	public void setColor(String color ) {
		this.color = color;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	
	public String getColor() {
		return color;
	}
	public String getGearType() {
		return gearType;
	}
	public int getDoor() {
		return door;
	}
	
	public String toString() {
		return String.format("������ :%s\n"
				+ "��� Ÿ�� %s \n"
				+ "���� ����%d \n",
				color,
				gearType,
				door);
	}
	
	
}


package car;
public class CarBean {
	
	private String brand,color, gearType,buy;
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
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	
	public String toString() {
		return String.format("�������� \n"
				+ "�귣��\n"
				+ "������ :%s\n"
				+ "��� Ÿ�� %s \n"
				+ "���� ����%d \n",
				brand,
				color,
				gearType,
				door);
	}
	
	
}


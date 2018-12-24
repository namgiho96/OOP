package car;
public class CarBean {
	
	private String brand,color, gearType,buy;
	private int door; // 문의 갯수
	
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
		return String.format("차량정보 \n"
				+ "브랜드\n"
				+ "차색깔 :%s\n"
				+ "기어 타입 %s \n"
				+ "문의 개수%d \n",
				brand,
				color,
				gearType,
				door);
	}
	
	
}


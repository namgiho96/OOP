package tv;

public class TVbean {
	private String brand,color;
	private boolean power;
	private int channel, price;
	
	public String getBrand() {
		return brand ;
	}
	public String getColor() {
		return color ;
	}
	public boolean getPower() {
		return power ;
	}
	public String getChannel() {
		return brand ;
	}
	public String getPrice() {
		return brand ;
	}
	
	public void setBrand(String brand ) {
		this.brand = brand;
	}
	public void setColor(String color ) {
		this.color = color;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public void setprice(int price ) {
		this.price = price;
	}
	public String toString() {
		return String.format("�귣�� :%s\n"
				+ "tv����%s\n"
				+ "tv����%s\n",brand,color,price);
	}

}

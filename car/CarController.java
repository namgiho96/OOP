package car;

import javax.swing.JOptionPane;


public class CarController {
	public static void main(String[] args) {
		CarBean car  = null;
		Carservies cars = new CarServiceImpl;
		
	
		while(true) {
			switch(JOptionPane.showInputDialog(
					"0.종료\n"
					+ "1.차량입고\n"
					+ "2.차량목록\n"
					+ "3.차량검색\n"
					+ "4.차량판매\n"
					)) {
				case "0":
					JOptionPane.showMessageDialog(null,
							"종료 ..");
					return;
				case "1":
				String brand =	JOptionPane.showInputDialog("브랜드");
				String color =	JOptionPane.showInputDialog("샐깔");
				String gearType =	JOptionPane.showInputDialog("기어갯수");
				String door =	JOptionPane.showInputDialog("문갯수");
					cars.add(brand,color,gearType,door);
					break;
				case "2":
					cars.list();
					break;
				case "3":
					cars.find();;
					break;
				case "4":
					cars.sell();
					break;
			}
		}
	}
}
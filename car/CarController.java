package car;

import javax.swing.JOptionPane;


public class CarController {
	public static void main(String[] args) {
		CarBean car  = null;
		Carservies cars = new CarServiceImpl;
		
	
		while(true) {
			switch(JOptionPane.showInputDialog(
					"0.����\n"
					+ "1.�����԰�\n"
					+ "2.�������\n"
					+ "3.�����˻�\n"
					+ "4.�����Ǹ�\n"
					)) {
				case "0":
					JOptionPane.showMessageDialog(null,
							"���� ..");
					return;
				case "1":
				String brand =	JOptionPane.showInputDialog("�귣��");
				String color =	JOptionPane.showInputDialog("����");
				String gearType =	JOptionPane.showInputDialog("����");
				String door =	JOptionPane.showInputDialog("������");
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
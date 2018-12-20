package car;

import javax.swing.JOptionPane;

import tv.TVbean;

public class Main {
	public static void main(String[] args) {
		CarBean carbean  = null;
		while(true) {
			switch(JOptionPane.showInputDialog(
					"0.종료\n"
					+ "1.차정보 입력 2.차정보")) {
				case "0":
					JOptionPane.showMessageDialog(null,
							"종료 ..");
					return;
				case "1":
					carbean = new CarBean();
					String color = JOptionPane.showInputDialog("차색깔입력");
					String gearType = JOptionPane.showInputDialog("기어타입");
					String door = JOptionPane.showInputDialog("문의개수");
					carbean.setColor(color);
					carbean.setGearType(gearType);
					carbean.setDoor(Integer.parseInt(door));
					break;
				case "2":
					JOptionPane.showMessageDialog(null,carbean.toString());
					
					break;
			}
		}
	}
}
package car;

import javax.swing.JOptionPane;

import tv.TVbean;

public class Main {
	public static void main(String[] args) {
		CarBean carbean  = null;
		while(true) {
			switch(JOptionPane.showInputDialog(
					"0.����\n"
					+ "1.������ �Է� 2.������")) {
				case "0":
					JOptionPane.showMessageDialog(null,
							"���� ..");
					return;
				case "1":
					carbean = new CarBean();
					String color = JOptionPane.showInputDialog("�������Է�");
					String gearType = JOptionPane.showInputDialog("���Ÿ��");
					String door = JOptionPane.showInputDialog("���ǰ���");
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
package tv;

import javax.swing.JOptionPane;



public class Main {
	public static void main(String[] args) {
		TVbean vbean = null;
		while(true) {
			switch(JOptionPane.showInputDialog(
					"0.����\n"
					+ "1.TV�۵� 2.TV��������")) {
				
				case "0":
					JOptionPane.showMessageDialog(null,
							"���� ..");
					return;
				case "1":
					vbean = new TVbean();
					String brand =JOptionPane.showInputDialog("tv�귣��");
					String color =JOptionPane.showInputDialog("tv����");
					String price =JOptionPane.showInputDialog("����");
					vbean.setBrand(brand);
					vbean.setColor(color);
					vbean.setprice(Integer.parseInt(price));
					//brand,color,price �Է��� 
					// TV�귣��
					// TV����
					// ����
					break;
				case "2":
					JOptionPane.showMessageDialog(null,vbean.toString());
					// ������ TV ����
					break;
			}
		}
	}
}
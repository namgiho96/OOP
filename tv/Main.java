package tv;

import javax.swing.JOptionPane;



public class Main {
	public static void main(String[] args) {
		TVbean vbean = null;
		while(true) {
			switch(JOptionPane.showInputDialog(
					"0.종료\n"
					+ "1.TV작동 2.TV정보보기")) {
				
				case "0":
					JOptionPane.showMessageDialog(null,
							"종료 ..");
					return;
				case "1":
					vbean = new TVbean();
					String brand =JOptionPane.showInputDialog("tv브랜드");
					String color =JOptionPane.showInputDialog("tv색상");
					String price =JOptionPane.showInputDialog("가격");
					vbean.setBrand(brand);
					vbean.setColor(color);
					vbean.setprice(Integer.parseInt(price));
					//brand,color,price 입력함 
					// TV브랜드
					// TV색상
					// 가격
					break;
				case "2":
					JOptionPane.showMessageDialog(null,vbean.toString());
					// 구입한 TV 스펙
					break;
			}
		}
	}
}
package Real;


import java.text.Format;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		while(true) {
			String menu = JOptionPane.showInputDialog("0.����\n "
					+ "1.ȸ������\n"
					+ "2.����\n"
					+ "3.�ζ�\n"
					+ "4.�޷� \n ");
			switch(menu) {
			case "0":
				JOptionPane.showInputDialog(null,"�ý��� ����");
			return;
			case "1":
				Member m = new Member();
				String name =JOptionPane.showInputDialog("�̸� �Է�");
				m.name = name;
				JOptionPane.showMessageDialog(null, 
						String.format("ȯ�� �մϴ�%s",m.name));
				String mMenu =JOptionPane.showInputDialog("ȸ������ �޴� \n"
				 		+ "1. BMI(Ű, ������)\n"
				 		+ "2.����(����,����,����,����,��ȸ)\n"
				 		+ "3.���� üũ(SSN)\n");
				 switch (mMenu) {
				case "1":
					 String[] arr = JOptionPane.showInputDialog(null,
							 ",Ű , ������ �Է�:").split(","); 
					String bmi2 = m.bmi(Double.parseDouble(arr[0])
							 ,Double.parseDouble(arr[1]));
					 JOptionPane.showMessageDialog(null,
							 String.format("%s���� %s�Դϴ�",m.name,
									 bmi2)); 
					break;
				case "2":
					String cla = JOptionPane.showInputDialog(null,
							"����,����,����,����,��ȸ");
					String[] arr2 = cla.split(",");
					m.grade(arr2);
					String grade = m.grade(arr2);
					JOptionPane.showMessageDialog(null,
							String.format("%s�� %s�����Դϴ�"
							,m.name,grade));
					break;
				case "3":
					String num = JOptionPane.showInputDialog(null,
							"�ֹε�Ϲ�ȣ�� �Է��ϼ���");
					JOptionPane.showMessageDialog(null,
							String.format("%s,%s�Դϴ�",m.name,m.GenderChecker(num)));
					break;
				default:
					break;
					
				}
			case "2":
				Calc calc = new Calc();
				String num=JOptionPane.showInputDialog("1.���� 2. ������");
				
				switch(num) {
				case "1" : 
					String[] ca = JOptionPane.showInputDialog("����� �Է� ex(10 + 10)").split(" ");
					switch(ca[1]) {
					case "+":
						String res =calc.plus(Integer.parseInt(ca[0]),Integer.parseInt(ca[2]));
						JOptionPane.showMessageDialog(null,
								String.format("%s �Դϴ�", res));
						break;
					case "-":
						String res1 =calc.minus(Integer.parseInt(ca[0]),Integer.parseInt(ca[2]));
						JOptionPane.showMessageDialog(null,
								String.format("%s �Դϴ�", res1));
						break;
					case "*":
						String res2 =calc.multi(Integer.parseInt(ca[0]),Integer.parseInt(ca[2]));
						JOptionPane.showMessageDialog(null,
								String.format("%s �Դϴ�", res2));
						break;
					case "/":
						String res3 =calc.dividi(Integer.parseInt(ca[0]),Integer.parseInt(ca[2]));
						JOptionPane.showMessageDialog(null,
								String.format("%s �Դϴ�", res3));
						break;
					case "%":
						String res4 =calc.mod(Integer.parseInt(ca[0]),Integer.parseInt(ca[2]));
						JOptionPane.showMessageDialog(null,
								String.format("%s �Դϴ�", res4));
						break;
					}
					case "2":
						Calc calc2 = new Calc();
						String ban = JOptionPane.showInputDialog(null,"���ϴ� �������� �Է��ϼ���");
						JOptionPane.showMessageDialog(null,
								String.format(calc2.gugudan(ban)));
					break;
				}
						
				break;
			

			
			}
		}
		
		
	
		/* Scanner s = new Scanner(System.in);
		 System.out.println("Ű , ������");
		 double h = scanner.nextDouble();
		 double w = scanner.nextDouble();
		 String res = m.bmi(w,h);
		 m.bmi();*/
		 //System.out.println(res);
		 }
	
}

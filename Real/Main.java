package Real;


import java.text.Format;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		while(true) {
			String menu = JOptionPane.showInputDialog("0.종료\n "
					+ "1.회원관리\n"
					+ "2.계산기\n"
					+ "3.로또\n"
					+ "4.달력 \n ");
			switch(menu) {
			case "0":
				JOptionPane.showInputDialog(null,"시스템 종료");
			return;
			case "1":
				Member m = new Member();
				String name =JOptionPane.showInputDialog("이름 입력");
				m.name = name;
				JOptionPane.showMessageDialog(null, 
						String.format("환영 합니다%s",m.name));
				String mMenu =JOptionPane.showInputDialog("회원관리 메뉴 \n"
				 		+ "1. BMI(키, 몸무게)\n"
				 		+ "2.학점(국어,영어,수학,과학,사회)\n"
				 		+ "3.성별 체크(SSN)\n");
				 switch (mMenu) {
				case "1":
					 String[] arr = JOptionPane.showInputDialog(null,
							 ",키 , 몸무게 입력:").split(","); 
					String bmi2 = m.bmi(Double.parseDouble(arr[0])
							 ,Double.parseDouble(arr[1]));
					 JOptionPane.showMessageDialog(null,
							 String.format("%s님은 %s입니다",m.name,
									 bmi2)); 
					break;
				case "2":
					String cla = JOptionPane.showInputDialog(null,
							"국어,영어,수학,과학,사회");
					String[] arr2 = cla.split(",");
					m.grade(arr2);
					String grade = m.grade(arr2);
					JOptionPane.showMessageDialog(null,
							String.format("%s는 %s학점입니다"
							,m.name,grade));
					break;
				case "3":
					String num = JOptionPane.showInputDialog(null,
							"주민등록번호를 입력하세요");
					JOptionPane.showMessageDialog(null,
							String.format("%s,%s입니다",m.name,m.GenderChecker(num)));
					break;
				default:
					break;
					
				}
			case "2":
				Calc calc = new Calc();
				String num=JOptionPane.showInputDialog("1.계산기 2. 구구단");
				
				switch(num) {
				case "1" : 
					String[] ca = JOptionPane.showInputDialog("계산기식 입력 ex(10 + 10)").split(" ");
					switch(ca[1]) {
					case "+":
						String res =calc.plus(Integer.parseInt(ca[0]),Integer.parseInt(ca[2]));
						JOptionPane.showMessageDialog(null,
								String.format("%s 입니다", res));
						break;
					case "-":
						String res1 =calc.minus(Integer.parseInt(ca[0]),Integer.parseInt(ca[2]));
						JOptionPane.showMessageDialog(null,
								String.format("%s 입니다", res1));
						break;
					case "*":
						String res2 =calc.multi(Integer.parseInt(ca[0]),Integer.parseInt(ca[2]));
						JOptionPane.showMessageDialog(null,
								String.format("%s 입니다", res2));
						break;
					case "/":
						String res3 =calc.dividi(Integer.parseInt(ca[0]),Integer.parseInt(ca[2]));
						JOptionPane.showMessageDialog(null,
								String.format("%s 입니다", res3));
						break;
					case "%":
						String res4 =calc.mod(Integer.parseInt(ca[0]),Integer.parseInt(ca[2]));
						JOptionPane.showMessageDialog(null,
								String.format("%s 입니다", res4));
						break;
					}
					case "2":
						Calc calc2 = new Calc();
						String ban = JOptionPane.showInputDialog(null,"원하는 구구단을 입력하세요");
						JOptionPane.showMessageDialog(null,
								String.format(calc2.gugudan(ban)));
					break;
				}
						
				break;
			

			
			}
		}
		
		
	
		/* Scanner s = new Scanner(System.in);
		 System.out.println("키 , 몸무게");
		 double h = scanner.nextDouble();
		 double w = scanner.nextDouble();
		 String res = m.bmi(w,h);
		 m.bmi();*/
		 //System.out.println(res);
		 }
	
}

package Real;

import java.util.GregorianCalendar;

public class Member {
	String name; //��� ����
	public String bmi(double w,double h) {
		String bmi = "";// ���ú���
		double bmi2 = w/((h*h)/10000);
		if(bmi2>=40){
			bmi = "����";
		}else if (bmi2>=35){
			bmi = "�ߵ ��";
		}else if (bmi2>=30){
			bmi = "�浵 ��";
		}else if(bmi2>=25){
			bmi = "��ü��";
		}else if(bmi2>=18.5){
			bmi = "����";
		}else{
			bmi = "��ü��";
		
		}
		return	bmi;
	} // bmi end
	
	public String grade(String[] arr2) {
		String grade = ""; //���� ������ �ݵ�� �ʱ�ȭ �ؾ� �Ѵ�. ��ġ �ʴ� ���� �Ҵ��.
	int a = Integer.parseInt(arr2[0]);
	int b = Integer.parseInt(arr2[1]);
	int c = Integer.parseInt(arr2[2]);
	int d = Integer.parseInt(arr2[3]);
	int e = Integer.parseInt(arr2[4]);
	
	int ave =(a+b+c+d+e)/5;
	
	if(ave>=100) {
		grade = "A";
	}else if(ave>=90){
		grade = "B";
	}else if(ave>=80) {
		grade = "C";
	}else if(ave>=70) {
		grade = "D";
	}else if(ave>=60) {
		grade = "E";
	}else
		grade = "F";
	
	return grade;
	}
	
	public String GenderChecker(String snn) {
		String checker = "";
		char ch = snn.charAt(7);
		
		switch(ch) {
		case '1': 
			checker = "����"; break;
		case '2':
			checker = "����"; break;
		case '3':
			checker = "����"; break;
		case '4':
			checker = "����"; break;
		case '5':
			checker = "�ܱ���"; break;
		case '6':
			checker = "�ܱ���"; break;
			
		default: 
			checker = "�߸��Է��ϼ˽��ϴ�";break;
				
			
		}
		return checker;
		
		
	}
	
	
}

package Gms;


public class BMI {
	public String bmi(double w,double h) {
	double bmi = w/((h*h)/10000);
	String bmi2 = "";
	
	if(bmi>=40){
		bmi2 = "����";
	}else if (bmi>=35){
		bmi2 = "�ߵ ��";
	}else if (bmi>=30){
		bmi2 = "�浵 ��";
	}else if(bmi>=25){
		bmi2 = "��ü��";
	}else if(bmi>=18.5){
		bmi2 = "����";
	}else{
		bmi2 = "��ü��";
	}
			return bmi2;
}
}

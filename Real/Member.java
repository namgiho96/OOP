package Real;

import java.util.GregorianCalendar;

public class Member {
	String name; //멤버 변수
	public String bmi(double w,double h) {
		String bmi = "";// 로컬변수
		double bmi2 = w/((h*h)/10000);
		if(bmi2>=40){
			bmi = "고도비만";
		}else if (bmi2>=35){
			bmi = "중등도 비만";
		}else if (bmi2>=30){
			bmi = "경도 비만";
		}else if(bmi2>=25){
			bmi = "과체중";
		}else if(bmi2>=18.5){
			bmi = "정상";
		}else{
			bmi = "저체중";
		
		}
		return	bmi;
	} // bmi end
	
	public String grade(String[] arr2) {
		String grade = ""; //로컬 변수는 반드시 초기화 해야 한다. 원치 않는 값이 할당됨.
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
			checker = "남자"; break;
		case '2':
			checker = "여자"; break;
		case '3':
			checker = "남자"; break;
		case '4':
			checker = "여자"; break;
		case '5':
			checker = "외국인"; break;
		case '6':
			checker = "외국인"; break;
			
		default: 
			checker = "잘못입력하셧습니다";break;
				
			
		}
		return checker;
		
		
	}
	
	
}

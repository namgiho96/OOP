package Gms;
public class Mycalender {
	public String calender(int year) {
		String res = "";
		if(year%100==0&&year%4!=0||year%400==0){
			res = "����";
		}else{
			res = "���";
		}
		return res;
	}
}

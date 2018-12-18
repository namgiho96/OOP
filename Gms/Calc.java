package Gms;

public class Calc {
	public String plus(int a , int b) {
	return a+b+"";
		
	}
	public String minus(int a , int b) {
		return a-b+"";
	}
	public String multi(int a, int b) {
		return a*b+"";
	}
	public String dividi(int a , int b) {
		return a/b+"";
	}
	public String mod(int a , int b) {
		return a%b+"";
	}
	public String gugudan(String dan) {
		String res = "";
		int dan2 = Integer.parseInt(dan);
		int [] a = new int[10];
		for(int i=0;i<a.length;i++){
			if(i!=0) {
				res += dan2+" * "+i+" = "+dan2*i+"\n";
				
			}
		}
		
		return res;
	}
}

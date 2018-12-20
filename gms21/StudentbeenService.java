package gms21;

import java.util.Random;

public class StudentbeenService {

	public String hakbun() {
		String bun = "";
		int a = 0;
		Random random = new Random();
		for(int i=0;i<11;i++) {
			if (i==4) {
				a = random.nextInt(11);
				bun +=a+"-";
			}else {
			a = random.nextInt(11);
			bun +=a;
		}
			
	}
		return bun;
	
}
	
	
	/*public String toString() {
		return String.format();*/
	}
//}
package Gms;
import java.util.Random;
public class Lotto {
 public String lotto() {
	 String res ="";
	 int[] a = new int[6];
	 
	 for(int i =0; i<6;i++) {
		 Random random = new Random();
		 a[i] = random.nextInt(45)+1;
		 res += a[i]+" ";
				 }
	 return res;
 }
 
}

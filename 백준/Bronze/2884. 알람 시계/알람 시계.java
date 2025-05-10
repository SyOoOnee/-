import java.util.*;

public class Main {
	public static void main (String args[]) {
		Scanner sr = new Scanner(System.in);
		int H = sr.nextInt();
		int M = sr.nextInt();
		
		if(M >= 45) {
			System.out.println(H +" "+ (M-45));
		}else if(H==0) {
			System.out.println((H=23) +" "+ (60+M-45));
		}else {
			System.out.println((H-1) +" "+ (60+M-45));
		}
		
	}
}
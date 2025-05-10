import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int A = scr.nextInt();
		int B = scr.nextInt();
		
		int C = B/100;
		B = B%100;
		int D = B/10;
		B= B%10;
		int E = B;
		
		
		System.out.println(A*E);
		System.out.println(A*D);
		System.out.println(A*C);
		System.out.println((A*E)+(A*10*D)+(A*100*C));
	}
}
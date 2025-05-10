import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int N = sr.nextInt();
		int i=0;
		
		while(i<9) {
			i++;
			System.out.println(N + " * " + i + " = " + (N*i));
		}
	}
}
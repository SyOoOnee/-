import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		
		int sum=0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}
			
			System.out.println(sum);
	}

}

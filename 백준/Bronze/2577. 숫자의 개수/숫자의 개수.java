import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		int A = sr.nextInt();
		int B = sr.nextInt();
		int C = sr.nextInt();
		
		int result = A*B*C;
		
		String str = Integer.toString(result);
		
		int [] count = new int[10];
		
		for(int i=0; i<str.length(); i++) {
			int digit = str.charAt(i) - '0';
			count[digit]++;
		}
		
		for(int i=0; i<count.length; i++)
			System.out.println(count[i]);
	}
}
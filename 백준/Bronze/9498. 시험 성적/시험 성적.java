import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		
		int a = sr.nextInt();
		
		System.out.println(
				a>=90 ? "A" :
				a>=80 ? "B" :
				a>=70 ? "C" :
				a>=60 ? "D" :
				"F"
				);
	}
}
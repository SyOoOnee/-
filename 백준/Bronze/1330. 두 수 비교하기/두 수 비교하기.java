import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sr= new Scanner(System.in);
		
		int A = sr.nextInt();
		int B = sr.nextInt();
		
		if(A>B) {
			System.out.println(">");
		}else if(A<B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}
}
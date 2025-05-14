import java.util.*;
import java.io.*;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt (br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int result = A*B*C;
				
		String rt = Integer.toString(result);
		
		int[] count= new int[10];
		
		for(int i=0; i<rt.length(); i++) {
			int digit = rt.charAt(i) - '0';
			count[digit]++;
		}
		for(int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}
	}
}
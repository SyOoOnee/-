import java.io.*;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		int[] arr= new int[26];
		for(int i=0; i<arr.length; i++) {
			arr[i]=-1;
		}
		
		for(int i=0; i<S.length(); i++) {
			char ch = S.charAt(i);
			int idx = ch -'a';
			if(arr[idx] == -1) {
				arr[idx] = i;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+"");
		}
	}
}
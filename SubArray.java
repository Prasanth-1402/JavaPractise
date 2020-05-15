import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubArray {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nq = br.readLine().trim().split(" ");
		int n = Integer.parseInt(nq[0]), limit = Integer.valueOf(nq[1]);
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]  = br.read();			
		}
		
	}

}

import java.io.*;
import java.util.ArrayList;

public class VowelFinder {

	public static void main(String[] args) throws Exception{
		int count;
		ArrayList<String> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		list.add("a");
		list.add("e");
		list.add("i");
		list.add("o");
		list.add("u");
		list.add("A");
		list.add("E");
		list.add("I");
		list.add("O");
		list.add("U");
		do {
			count=0;
			String str = br.readLine();
			for(int i=0;i<list.size();i++) {
				if(str.contains(list.get(i))) {
					count++;
				}
			}
			System.out.println(count);
		}while(n!=0);
		
		
	}

}

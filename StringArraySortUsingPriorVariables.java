import java.util.Scanner;

public class StringArraySortUsingPriorVariables {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int size = scan.nextInt();
			String[] arr = new String[size];
			for(int i=0;i<size;i++) {
				arr[i] = scan.next();			
			}
			System.out.println(0);
			for(int i=1;i<size;i++) {
				int count=0;
				for(int j=i-1;j>=0;j--) {
					int c = arr[j].compareTo(arr[i]);
					if(c<0)
						count++;					
				}
				
				System.out.println(count);
				
			}
			
	scan.close();
	}

}

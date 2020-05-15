import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DupRemoveArray {
		public static void main(String[] args) {
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			Set<Integer> set = new LinkedHashSet<Integer>();
			int x,a;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Size of the Array: ");
			a = scan.nextInt(); 
			for(int i=0;i<a;i++) {
				x = scan.nextInt();
				list.add(x);
			}
			System.out.println("The Given Array is : "+list);
			
			set.addAll(list);
			System.out.println("Duplicate Removed Result :"+set);
			scan.close();
		}
}

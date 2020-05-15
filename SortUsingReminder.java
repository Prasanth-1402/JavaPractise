import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class SortUsingReminder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int div = scan.nextInt();
		List<Com> arr = new ArrayList<Com>();
		for (int i=0;i<count;i++) {	
			int dvnd = scan.nextInt();
			Com com = new Com(dvnd,div);
			arr.add(com);
		}
	
	Collections.sort(arr);
	for(Com c:arr)
		System.out.print(c.getDivident()+"  ");
	scan.close();
	}	
}

class Com implements Comparable<Com>{
	int dvnd,div;
	public Com(int d, int s) {
		dvnd = d;
		div = s;
	}
	public int getDivident() {
		return dvnd;
	}
	public int compareTo(Com c) {
		return (this.dvnd%this.div) - (c.dvnd%this.div);
	}
}
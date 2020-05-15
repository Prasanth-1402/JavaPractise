import java.util.Scanner;
public class HeightOrder {

	public static void main(String[] args) {
		int count,maxcount=0,mincount=0,min,max;
		Scanner scan = new Scanner(System.in);
		count = scan.nextInt();
		int[] arr = new int[count];

		for(int i=0;i<count;i++) {
			arr[i] = scan.nextInt(); 
			}
		max = arr[0];
		min = arr[0];
		for(int i=0;i<count;i++) {	
				if(arr[i]<min) {
					 min = arr[i];
				}
				if(arr[i]>max) {
					 max = arr[i];
				}
		}
		
		for(int i=0;i<count;i++) {
			if(arr[i] ==max)
				maxcount++;
			if(arr[i]==min)
				mincount++;
		}
		System.out.println("Min = " + mincount);
		System.out.println("Max = " + maxcount);
		System.out.println(maxcount - mincount);
		scan.close();
	}

}

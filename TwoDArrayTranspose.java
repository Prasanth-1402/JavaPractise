import java.util.Scanner;

public class TwoDArrayTranspose {

	public static void main(String[] args) {
		int rows, columns;
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter the Number of Rows : ");
		rows = scan.nextInt();
		System.out.println("Enter the Number of Columns : ");
		columns = scan.nextInt();
		int arr[][] = new int[rows][columns];
	
		for(int i=0;i<rows;i++) {		
			for(int j=0;j<columns;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("The Given Matrix is: ");

		for(int i=0;i<rows;i++) {		
			for(int j=0;j<columns;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("The Transpose of the above Matrix is: ");
		
		for(int i=0;i<columns;i++) {
			for(int j=0;j<rows;j++) {
				System.out.print (arr[j][i] +" ");
			}
			System.out.println(" ");
		}
		scan.close();	
	}

}

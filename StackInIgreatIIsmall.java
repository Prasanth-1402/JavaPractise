import java.util.Scanner;

public class StackInIgreatIIsmall {														//wrong answer

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int max=0;
			int size = scan.nextInt();
			int arr[] = new int[size];
			for(int i=0;i<size;i++) {
				arr[i] = scan.nextInt();
			}
			
			for(int i=0;i<size;i++) {
				for(int j=i+1;j<size;j++) {
					if(arr[i]<arr[j]) {
						max = arr[j];
						for(int k=j+1;k<size;k++) {
							if(arr[k]<max) {
								System.out.println(arr[k]);
								break;
						}
							else
								k++;
						}
					}
					else
						j++;
					
				}
			}
			
			scan.close();
	}

}

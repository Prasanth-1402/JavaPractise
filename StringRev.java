import java.util.Scanner;

public class StringRev {
	
	public static void main(String[] args) {
		System.out.println("Enter First Number :");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("Enter Second Number :");
		int num2 = scan.nextInt();
		swap (num1, num2); 
		close(scan);
	}
	
	public static void swap (int num1, int num2) {
	
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println(num1+" "+num2);
	
	}
	
	public static  void close(AutoCloseable ac) {
		try {
			ac.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

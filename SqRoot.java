import java.util.Scanner;

public class SqRoot {

	public static void main(String[] args) {

		int number;
		System.out.println("Enter a Number to Find Square Root:");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		System.out.println((int)Math.pow(number, 0.5));
		scan.close();
	}

}


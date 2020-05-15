import java.util.Scanner;

public class FactorialCheck {

	public static void main(String[] args) {
			
		int number,x=1;
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		for(int i=1;i<=number;i++) {
			x= x*i;
		}
		System.out.println(x);
		scan.close();
	}

}

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		double count=0,digit,newNumber=0;
		Scanner scan = new Scanner(System.in);
		int orgnumber = scan.nextInt();
		int copyNumber = orgnumber;
		while(orgnumber!=0) {
			count++;
			orgnumber = orgnumber/10;
		}
		orgnumber = copyNumber;
		while(copyNumber!=0) {
			digit = copyNumber%10;
			copyNumber = copyNumber/10;
			newNumber = Math.pow(digit, count) + newNumber;
		}
		if(newNumber==orgnumber)
			System.out.println((int)newNumber +" is a Armstrong Number");
		else
			System.out.println("It is not a Armstrong Number");
	scan.close();
	}
}

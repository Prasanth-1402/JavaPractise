import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {

		String str1, str2;
		int count =0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the First String : ");
		str1 = scan.nextLine();
		System.out.println("Enter the Second String : ");
		str2 = scan.nextLine();
		if(str1.length()==str2.length()) {
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					count++;
				}
			}
		}
		if(count == str1.length()) {
			System.out.println("Anagrammm..!!!");
		 }
		}
		else
			System.out.println("String Lengths are Mismatching");
		
		scan.close();
	}

}

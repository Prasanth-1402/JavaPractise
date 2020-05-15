import java.util.Scanner;

public class FirstNonRep {

	public static void main(String[] args) {

		String str;
		int count =0;
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count=1;
//					break;
		     	}
			if(count == 0) {
				System.out.println("The  Non Repeated Character in the String is :"+str.charAt(i));
				break;
			}
			}
	   }
	   scan.close();
  }
}

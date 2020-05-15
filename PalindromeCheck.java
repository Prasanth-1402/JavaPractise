import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {			
			
			int count=0;
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
		    for(int i=0;i<input.length();i++) {
		    	for(int j=input.length()-1;j>=0;j--) {
		    			if(input.charAt(i)==input.charAt(j)) {
		    				count++;
		    				i++;
		    			}
		    	}
		    }
		    if(count==input.length()) 
		    	System.out.println("It is a Palindrome!");
		    else
		    	System.out.println("Not a Palindrome");
		    
		   
		scan.close();
    }
}

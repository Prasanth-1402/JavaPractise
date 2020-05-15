import  java.util.Scanner;
public class BracketEqualization  	 {

	public static void main(String[] args) {
		int count = 0;
		Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			char[] carr = input.toCharArray();
			if(input.length()%2==0) {
				int halfsize = input.length()/2-1;
				for(int i = 0;i<=input.length();i++) {
					for( int j=(input.length()-1)-i;j>=0;j--) {
						System.out.println(carr[i] +"   "+carr[j]);
						if((carr[i]=='(' && carr[j]==')')||((carr[i]=='[' && carr[j]==']'))||((carr[i]=='{' && carr[j]=='}'))) {
							count++;
							break;
							
						}
					
						else 
							break;
					}
				}
			}
			else
				System.out.println("Brackets Not Equal");
			if(count == input.length()/2 ) {
				System.out.println(count +" "+input.length() + " YES");
			}
			else
				System.out.println(count +" "+ input.length() + " NO");
			scan.close();
	}

}

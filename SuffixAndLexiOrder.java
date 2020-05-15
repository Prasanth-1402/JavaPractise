import java.util.*;

public class SuffixAndLexiOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int number = scan.nextInt();
		Set<String> str = new TreeSet<>();
		str.add(s);
		while(!s.isEmpty()) {
			String news = s.substring(1);
			str.add(news);
			s = news;
		}
		System.out.println(str.toArray()[number]);
		
	scan.close();
	}

}

import java.util.*;

public class SetandList {

	public static void main(String[] args)  {
	
	List<Integer> list1 = new ArrayList<>();
	list1.add(14);
	list1.add(122);
	list1.add(1);
	list1.add(13);
	list1.add(13);
	System.out.println(list1);
	
	Set<Integer> set1 = new HashSet<>(list1);
	Set<Integer> set2 = new TreeSet<>(set1);
	System.out.println(set2);
	}
}

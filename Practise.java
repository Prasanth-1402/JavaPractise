import java.util.*;

public class Practise {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(4);
		list1.add(46);
		int size = list1.size();
		int[] arr = new int[size];
		list1.toArray();
		System.out.println(list1);
	}
}
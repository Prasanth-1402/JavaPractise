import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapPractise {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new LinkedHashMap<>();
		map1.put(1, "Abishek");
		map1.put(2, "Bala");
		map1.put(30, "Dharan");
		map1.put(15, "Jack");
		map1.put(27, "Manoj");
		map1.put(9, "Yuvan");
		
		System.out.println(map1.size());
		synchronized (map1) {
				Set<Integer> maptoset = map1.keySet();
				Iterator<Integer> itr = maptoset.iterator();
				while(itr.hasNext()) {
					int keys = itr.next();
					String value = map1.get(keys);
					System.out.println(keys + " "+ value);
		}
	  }
	}

}

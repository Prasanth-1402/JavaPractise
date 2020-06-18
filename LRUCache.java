import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LRUCache {
    private static Scanner scan = new Scanner((System.in));
    Set<Integer> cache = new LinkedHashSet<Integer>();
    int cacheLength;

    public boolean get(int key) {
        if (cache.contains(key)) {
            cache.remove(key);
            cache.add(key);
            return true;
        }
        return false;
    }

        public void put ( int key){
            if (cache.contains(key))
                cache.remove(key);
            else if (cacheLength == cache.size()) {
                int firstElement = cache.iterator().next();
                cache.remove(firstElement);
            }
            cache.add(key);
        }

    public static void main(String[] args) {
        LRUCache lr = new LRUCache();
        lr.cacheLength = 5;
        lr.cache.add(18);
        lr.cache.add(14);
        lr.cache.add(11);
        lr.cache.add(17);
        lr.cache.add(15);
        System.out.println(lr.get(18));
        lr.put(19);
        lr.put(10);
        System.out.println(lr.cache);

    }

}


import java.util.*;

class Cricket {
		String name;
		int avg;
		
		public Cricket(String n,int a)   {
			
			name=n;
			avg=a;
		}		
}

class SortThis implements Comparator<Cricket>{

	@Override
	public int compare(Cricket o1, Cricket o2) {
		  
			  return (o2.avg-o1.avg);
	}
	
	
}


public class Iteratorr  {
	public static void main(String[] args)  {
		
		Cricket cr1 = new Cricket("Arjun",13);
		Cricket cr2 = new Cricket("Bala",72);
		Cricket cr3 = new Cricket("Dhilip",45);
		Cricket cr4 = new Cricket("Prasanth",87);
		Cricket cr5 = new Cricket("Xavi",73);
		Cricket cr6 = new Cricket("Ben",66);
		
		PriorityQueue<Cricket> pq = new PriorityQueue<Cricket>(new SortThis());
		pq.add(cr1);
		pq.add(cr2);
		pq.add(cr3);
		pq.add(cr4);
		pq.add(cr5);
		pq.add(cr6);
		
		
		Iterator<Cricket> itr = pq.iterator();
		while(itr.hasNext())  {
			Cricket ck = (Cricket)itr.next();
			System.out.println(ck.name+"   "+ck.avg);
		}
		
		
	}
}
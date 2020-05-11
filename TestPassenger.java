import java.util.*;
import java.io.*;

class Passenger {
	
	public String name;
	public int age;
	
public Passenger (String name,int age) {
	
	this.name=name;
	this.age=age;
 }
	
}


class SortByAge implements Comparator<Passenger>{
	
		

@Override
public int compare(Passenger o1, Passenger o2) {

	return (o2.age-o1.age);
}




public class TestPassenger {
	
	public static void main(String[] args)  {
		
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(r);
		System.out.println("Enter the Number of Passengers:");
		int n = br.read();
		
		ArrayList<Passenger> al = new ArrayList<Passenger>(n);
		
		for(int i=1;i<=n;i++) {
			
			System.out.println("Enter the customer " +i + "Details:");
			
			System.out.println("Enter the customer Name:");
			String name= br.readLine();
			
			System.out.println("Enter the customer Age:");
			int age = br.read();
			
		Passenger p1 = new Passenger(name,age);
		
		al.add(p1);
		
		}
		
		//Comparator SortByAge;
		Collections.sort(al,new SortByAge);
			
		
		Iterator<Passenger> itr = al.iterator();
		
		while(itr.hasNext()) {
			Passenger pass = (Passenger)itr.next();
			System.out.println(pass.name +" "+pass.age);
		}
			
	}
	
}




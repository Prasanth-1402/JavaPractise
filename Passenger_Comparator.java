import java.io.*;
import java.util.*;


class Passengers {
    
    public String name;
    public int age;
    
    public Passengers(String name, int age){
        this.name=name;
        this.age=age;

    }


}




class AgeSort implements Comparator<Passengers> {

	@Override
	public int compare(Passengers o1, Passengers o2) {
		
		return (o2.age - o1.age);
	}
    
    
   

}

public class Passenger_comparator {
    

public static void main(String[] args)  {
     System.out.println("Enter the number of passengers");
     Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
     
       ArrayList<Passengers> al= new ArrayList<Passengers>(n);
     
     for(int i=1;i<=n;i++)
     {
         System.out.println("Enter the name of the passenger" +i);
             String name=sc.nextLine();
     
     
        System.out.println("Enter the age of the passenger" +i);
            int age=sc.nextInt();
     
       Passengers p= new Passengers(name,age);
     
      al.add(p);
     }
     
       Collections.sort(al,new AgeSort());
       
       for(Passengers t :al)
       {
            System.out.println();
       }
     
     
}    

}
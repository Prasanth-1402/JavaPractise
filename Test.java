import java.util.*;
import java.io.*;

class Student {
	
	String name;
	int regno;
	String dep;
	double mobno;
	
	
	public Student(String n,int r,String d,double m)  {
		name=n;
		regno = r;
		dep=d;
		mobno=m;
	}
}

public class Test {
	 public  static void main(String[] args)  throws IOException{
		 
	    
		 
		 
		 
		 HashMap<Integer,Student> hm = new HashMap<Integer, Student>();
	 
	    
	    
	    
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Press 1 for adding elements");
		System.out.println("Press 2 for Deleting elements");
		System.out.println("Press  3 for viewing a particular element");
	
		int option = Integer.parseInt(br.readLine());
	switch(option) {
		
case 1:
		System.out.println("Number Of elements to be entered:");
		int n = Integer.parseInt(br.readLine());
		
	for(int i=0;i<n;i++)
	{	
		
		System.out.println("The corresponding Name is:");
		String name = br.readLine();
		
		System.out.println("The Register number is:");
		int regno = Integer.parseInt(br.readLine());
		
		System.out.println("Department:");
		String dep = br.readLine();
		
		System.out.println("Mobile Number is:");
		int mobno=Integer.parseInt(br.readLine());
		
		hm.put(regno,new Student(name,regno,dep,mobno));
	 }
	 
	//System.out.println("Enter the Key for which the element needs to be displayed:");
	
        // int k =Integer.parseInt(br.readLine());
	
//	if(hm.containsKey(k))  {
		
		
	for(Map.Entry<Integer, Student> e:hm.entrySet())  {
		Student bq=(Student)hm.entrySet();
		System.out.println("The Elements are:"+bq.dep+" "+e.getKey());
	}
  }
}
	 }

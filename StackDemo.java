import java.util.*;


class Car {
	 
	 public String brand;
	 public int year;
	 public float mileage;
	 
	 public Car(String b, int y, float m)
	 {
		 this.brand=b;
		 this.year=y;
		 this.mileage=m;
	 }
}

public class StackDemo {
	
	public static void main (String[] args)  {
		
		Car c1= new Car("Audi",2014,12.4f);
		Car c2= new Car("BMW",2018,14.2f);
		Car c3=new Car("Benz",2017,15.93f);
		
		Stack<Car> sc = new Stack<Car>();
		sc.push(c1);
		sc.push(c2);
		sc.push(c3);
		System.out.println(sc.peek());
		System.out.println(sc.pop());
		System.out.println(sc.pop());
		System.out.println(sc.peek());
		System.out.println(sc.search(c1));
		System.out.println(sc.pop());
		System.out.println(sc.empty());
		
	}
}



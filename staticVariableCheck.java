class Dog {
	public static String name;
	
	public Dog(String n) {
		name = n;
	}
	public void printname() {
		System.out.println(name);
	}
}



public class staticVariableCheck {

	public static void main(String[] args) {
		Dog rex  = new Dog("rex");
		Dog fluf = new Dog("Fluf");
		rex.printname();
		fluf.printname();
		

	}

}

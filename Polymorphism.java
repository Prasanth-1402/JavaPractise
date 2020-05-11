public class Polymorphism{
	
	public static void main(String[] args) {
		
		AnimalForPloy[]  animalList = new AnimalForPloy[3];
		Bird[] BirdList = new Bird[4];
		
		animalList[1] = new DogForPoly();
		animalList[2] = new Cat();
		BirdList[1] = new Ostrich();
		BirdList[2] = new Ostrich();
		
		for(int a=1;a<animalList.length;a++) {
			animalList[a].makeNoise();
			animalList[a].sleep();
			if(a==1)
				BirdList[a].fly("Eagle");
		}
	}
}

class AnimalForPloy{
	public void makeNoise() {
		System.out.println("An Animal is making noise...");
	}
	public void sleep() {
		System.out.println("Some animal is sleeping...");
	}
}

class DogForPoly extends AnimalForPloy {
	public void makeNoise() {
		System.out.println("Dog is Barking... ");
	}
	public void attack() {
		System.out.println("Dog started biting...!");
	}
}

class Cat extends AnimalForPloy {
	public void makeNoise() {
		System.out.println("cat is making some noise...");
	}
	
	public void snackTime() {
		System.out.println("A cat is drinking milk..");
	}
}

class Bird {
	public void fly(String birdName) {
		System.out.println("\n"+birdName + " is Flying.."+"\n");
	}
}

class Ostrich extends Bird{
	public void fly() {
			System.out.println("An Ostrich is trying to fly...");
	}
}
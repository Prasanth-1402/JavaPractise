public class CarPoly {

    public static void main(String[] args) {
        Honda Hocar = new Honda(5, "verna");
        Hocar.StartEngine();
        Hocar.accelarate();
        Hocar.brake();
        System.out.println(Hocar.getCylinders());
    }




}
    class Car {
    private int cylinders;
    private String name;
    private boolean engine ;
    private int wheels ;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void StartEngine(){
        System.out.println("Engine is started");
    }
    public void accelarate(){
        System.out.println("accelaration is on !");
    }
    public void brake(){
        System.out.println("Braking Now");}

    }

 class Honda extends Car{

     public Honda(int cylinders, String name) {
         super(cylinders, name);
     }

     @Override
     public void StartEngine() {
         System.out.println("Yo! Yo!! Here starts My " + getClass().getName() + " !!!! ");
     }

 }
class Audi extends Car{

    public Audi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void StartEngine() {
        System.out.println("Yo! Yo!! Here starts My " + this.getName() + " !!!! ");
    }

}

class Hyundai extends Car{

    public Hyundai(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void StartEngine() {
        System.out.println("Yo! Yo!! Here starts My " + this.getName() + "  !!!! ");
    }
}
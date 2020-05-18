class Hamburger {
    private double price;
    private String roll_type;
    private String meat;
    private String name;

    public Hamburger(String roll_type, String meat) {
        this.price = 20;
        this.roll_type = roll_type;
        this.meat = meat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double get_price() {
        return price;
    }

    public String getRoll_type() {
        return roll_type;
    }

    public String getMeat() {
        return meat;
    }

    public String getName() {
        return name;
    }

    public double add_tomato() {
        System.out.println("Tomato Added");
        double p = get_price() + 2;
        return p;
    }

    public double add_carrot() {
        System.out.println("Carrot Added");
        double p = get_price() + 3;
        return p;
    }

    public double add_lettuce() {
        System.out.println("lettuce Added");
        double p = get_price() + 5;
        return p;    }
}
class HealthyHamburger extends Hamburger {
    private double price ;
    public HealthyHamburger(String roll_type, String meat) {
        super("brown_rye_bread_roll", meat);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void add_sauce() {
        System.out.println("Sauce Added....");
        price = price +3;
    }

    public void add_mayonnaise() {
        System.out.println("Mayonnaise Added....");
        price = price +6;
    }
}

class DeluxeHamburger extends Hamburger{
    private int price ;

    public DeluxeHamburger(String roll_type, String meat) {
        super(roll_type, meat);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void add_drink(){
        System.out.println("Drinks Added..");
    }
    public void add_chips(){
        System.out.println("Chips Added..");
    }

 }

public class HamBill{
    public static void main(String[] args) {
        DeluxeHamburger hb = new DeluxeHamburger("bread", "Chicken");
        hb.setPrice(50);
        hb.add_chips();
        hb.add_drink();
        System.out.println(hb.getPrice());
    }

}

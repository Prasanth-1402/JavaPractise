import jdk.nashorn.api.tree.BreakTree;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(25,109,true);
        System.out.println(printer.AddToner(98));
        System.out.println(printer.printPage());

    }
}

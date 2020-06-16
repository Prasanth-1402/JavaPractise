import java.util.Scanner;

public class OddLetteredStringGenerator {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    int n = scanner.nextInt();
    generateTheString(n);
    scanner.close();
    }
    public static String generateTheString(int n) {
        return "a"+"ba".substring(n%2, 1+n%2).repeat(n-1);
    }

}

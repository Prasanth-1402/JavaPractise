import java.util.Scanner;

public class CircularKilling {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        System.out.println(circularKill(n));
    }
    private static int circularKill(int n) {
        int Binaryresult,FinalResult;
        String binary = Integer.toBinaryString(n);
        char[] arr = binary.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') arr[i] = '0';
            else arr[i] = '1';
        }
        Binaryresult = Integer.parseInt(new String(arr),2);
        int finalResult = n - Binaryresult;
        return finalResult;
    }
}


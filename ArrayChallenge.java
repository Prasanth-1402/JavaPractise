import java.util.Scanner;

public class ArrayChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
       int[] arr =  readIntegers(count);
        System.out.println(findMin(arr));
    }
    public static int[] readIntegers(int count) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter All the Numbers to be entered In the Array : ");
        int[] array = new int[count];
        for (int i = 0; i < count; i++){
            array[i] = scan.nextInt();
            scan.nextLine();
        }
        return array;
    }
    public static int findMin(int[] array){
        int min = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min)
                min = array[i];
        }
        return min;
    }
}

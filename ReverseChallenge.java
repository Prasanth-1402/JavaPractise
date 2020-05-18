import java.util.Scanner;

public class ReverseChallenge {
    public static void reverse(int[] array){
        for(int i=0;i<array.length/2;i++){
          int temp;
                 temp = array[i];
                 array[i] = array[array.length-i-1];
                array[array.length-i-1] = temp;

             }
            }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int count = scan.nextInt();
        int[] arr = new int[count];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<count;i++){
            arr[i] = scan.nextInt();
            scan.nextLine();
        }
//        System.out.println(arr.length);
        reverse(arr);
        for (int i=0;i<count;i++){
            System.out.print(arr[i] +" ");
        }
    }
}


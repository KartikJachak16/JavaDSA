import java.util.*;

public class SumofArray {
    public static void main(String args[]) {
        int sum = 0;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.println("Enter array elements: ");
        for(int i=0; i<size; i++) {
            number[i] = sc.nextInt();
        }
        
        for(int i=0; i<number.length; i++) {
            sum = sum + number[i];
        }
        
        System.out.println("The Sum of array of Elements: " +sum);
        
    }
}

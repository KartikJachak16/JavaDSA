import java.util.*;

public class Input_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
     
        //Enter the Elements in the array
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        //Print the Elements in the array
        for(int i=0; i<numbers.length; i++) {
            System.out.println("Elements in the array: " +numbers[i]);
        }

    }
}

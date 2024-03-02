import java.util.*;

public class Sort_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter elements in the array: ");
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<numbers.length-1; i++) {
            if(numbers[i] > numbers[i+1]) {
                isAscending = false;
            }
        }

        if(isAscending) {
            System.out.println("Array is sorted in the ascending order");
        } else {
            System.out.println("Array is not sorted in the ascending order");
        }
    }
}

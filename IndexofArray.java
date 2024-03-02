import java.util.Scanner;

public class IndexofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size]; 

        // Enter elements
        System.out.println("Enter elements of an array: ");
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Search elements
        int len = array.length;
        System.out.println("Enter element to search: ");
        int search = sc.nextInt();

        for(int i = 0; i < len; i++) {
            if(search == array[i]) {
                System.out.println("Element present at index: "+i);
            }
        }    
    }    
}
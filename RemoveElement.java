import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = {11, 22, 44, 25, 74};
        System.out.println("The Original array: "+Arrays.toString(array));

        System.out.println("Enter the index of the element you wish to remove: ");
        int remove = sc.nextInt();

        for(int i = remove; i < array.length -1; i++) {
            array[i] = array[i + 1];
        }
        
        System.out.println("Array after the Element was removed: "+Arrays.toString(array));

    }
}

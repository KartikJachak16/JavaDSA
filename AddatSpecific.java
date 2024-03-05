import java.util.Scanner;

public class AddatSpecific {
   public static void main(String args[]) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int new_array[] = new int[size];
   
        System.out.println("Enter array: ");
        for (int i = 0; i < size; i++) {
            new_array[i] = sc.nextInt();
        }

        System.out.println("Enter the position you wish to insert an Element:");
        int index = sc.nextInt();
        System.out.println("Enter the element you wish to enter: ");
        int element = sc.nextInt();

        for(int i = new_array.length - 1; i < index; i--){
            new_array[i] = new_array[i - 1];
        }

        System.out.println("Your Array: ");
        for(int i=0; i < new_array.length; i++) {
            System.out.println(new_array[i]+ " ");
        }

        new_array[index] = element;

        System.out.println("New Array: ");
        for(int i=0; i < new_array.length; i++) {
            System.out.println(new_array[i]+ " ");
        }
    } 
}

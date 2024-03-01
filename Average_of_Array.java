import java.util.*;

public class Average_of_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter elements for the matrix: ");
        for(int i=0; i<size; i++) {
                numbers[i] = sc.nextInt();
        }

        int sum = 0;
        int total = numbers.length;
        for(int i=0; i<numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("The Average of Array is: "+sum/total);
    }
}

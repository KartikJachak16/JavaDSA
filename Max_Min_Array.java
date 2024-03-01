import java.util.*;

public class Max_Min_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //Enter the Elements in the array
        System.out.println("Enter the Elements of array: ");
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
            
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The Maximum Value in the array is: "+max);
        System.out.println("The Minimum Value in the array is: "+min);

    }
}

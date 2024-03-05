import java.util.Scanner;

public class Reverse_Array {
    public static void Reverse(int arr[], int n) {
        int a[] = new int[n];
        int temp = n;
        for (int i = 0; i < n; i++) {
            a[temp - 1] = arr[i];
            temp = temp -1; 
        }

        System.out.println("Reversed Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];

        System.out.println("Enter your array elements: ");
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array: ");
        for(int i=0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        Reverse(array,size);
    }
}

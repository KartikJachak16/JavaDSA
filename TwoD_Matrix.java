import java.util.*;

public class TwoD_Matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row of columns for the martix: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];

        //Enter Elements for the matrix
        System.out.println("Enter the given matrix: ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        //Display the matrix
        System.out.println("Given Matrix: ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
            System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}

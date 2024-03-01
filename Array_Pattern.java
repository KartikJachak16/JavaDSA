import java.util.*;

public class Array_Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        String pattern[][] = new String[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                pattern[i][j] = "_";
            }
        }

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(pattern[i][j]+" ");
            }
            System.out.println();
        }
    }
}

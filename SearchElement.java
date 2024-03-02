import java.util.*;

public class SearchElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int numbers[][] = new int[rows][cols];

        //Enter the matrix
        System.out.println("Enter elements: ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        //Search the Element
        System.out.println("Enter the element to Search: ");
        int x = sc.nextInt();

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(x == numbers[i][j]) {
                    System.out.println("The Number "+x+" is at location ("+ i + ", "+ j +")");
                } else {
                    System.out.println("The Number not present");
                }
            }
        }
    }
}

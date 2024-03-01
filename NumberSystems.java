import java.util.*;

public class NumberSystems {
    public static void main(String args[]) {
        int positive = 0, negative = 0, zeros = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to enter a number and 0 to exit: ");
        int input = sc.nextInt(); 

        while(input == 1) {
            System.out.println("Enter your Number: ");
            int number = sc.nextInt();
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zeros++;
            }
        
        System.out.println("Press 1 to enter a number and 0 to exit: ");
        input = sc.nextInt();     
        
        }
        System.out.println("Positives: " +positive);
        System.out.println("Negatives: " +negative);
        System.out.println("Zeros: " +zeros);
        
    }
}

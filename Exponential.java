import java.util.*;

public class Exponential {
    public static void checkPower(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }

        System.out.println("X to the Power of n is : " +result);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();

        checkPower(x, n);
    }
    
}

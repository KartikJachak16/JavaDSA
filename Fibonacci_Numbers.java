import java.util.*;

public class Fibonacci_Numbers {

    public static void Fibonacci(int n) {
        int a = 0, b=1;
        System.out.println(a+" ");
        
        if(n>1) {
            for(int i=0; i<=n; i++) {
                System.out.println(b+" ");
                int temp = b;
                b = a+b;
                a = temp;
            }
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        Fibonacci(n);
    }
}

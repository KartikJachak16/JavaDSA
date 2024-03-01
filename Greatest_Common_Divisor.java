import java.util.Scanner;

public class Greatest_Common_Divisor {
    public static void gcd(int num1, int num2) {
        while (num1 != num2) {
            if( num1 > num2 ) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }

        System.out.println("GCD is: "+num2);
    }
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        gcd(num1, num2);
    }
}

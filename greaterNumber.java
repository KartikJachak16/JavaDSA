import java.util.Scanner;

public class greaterNumber {
    public static void printGreater(int a, int b) {
        if (a>b) {
            System.out.println("A is greater than B");
        }
        else if (b>a) {
            System.out.println("B is greater than A");
        }
        else {
            System.out.println("Both are Equal!!");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        printGreater(a, b);
    }

}

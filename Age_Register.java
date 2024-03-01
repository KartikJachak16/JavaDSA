import java.util.Scanner;

public class Age_Register {
    public static void checkAge(int age) {
        if(age >= 18) {
            System.out.println("Congratulations!! You are eligible to vote");
        }
        else {
            System.out.println("Sorry, you are not eligible to vote");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        checkAge(age);
    }
}

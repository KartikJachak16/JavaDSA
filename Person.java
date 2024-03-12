import java.util.Scanner;

public class Person {
    private int age;
    public Person(int initialAge) {
        if(initialAge >= 0) {
            this.age = initialAge;
        } else if(initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0");
        }
    }

    public void AmIOld() {
        if(age < 13) {
            System.out.println("You are young.");
        } else if(age >= 13 && age<18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void passesYear() {
        this.age = age + 1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.AmIOld();

            for(int j=0; j<3; j++) {
                p.passesYear();
            }
            p.AmIOld();
            System.out.println();
        }
        sc.close();
    }
}

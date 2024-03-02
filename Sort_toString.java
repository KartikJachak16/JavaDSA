import java.util.*;

public class Sort_toString {
    public static void main(String[] args){
        int numbers[] = {145,156,178,745,685};
        String names[] = {"Bat", "Cat", "Dog", "Apple", "Banana"};

        System.out.println("The unSorted list of numbers: " +Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("The Sorted list of numbers: " +Arrays.toString(numbers));

        System.out.println("The unSorted list of names: " +Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("The unSorted list of numbers: " +Arrays.toString(names));

    }
}

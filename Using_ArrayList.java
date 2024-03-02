import java.util.ArrayList;

public class Using_ArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        //for adding an element in the ArrayList
        list.add(25);
        list.add(27);
        list.add(45);
        list.add(16);
        System.out.println("Elements in the ArrayList are: " +list);

        //Getting a specific element from an ArrayList
        int element = list.get(2);
        System.out.println("Element requested: " + element);

        //Adding an element in between elements
        list.add(2, 10);
        System.out.println("New list after the element was added: " +list);

        //Replace an element in the list
        list.set(3,15);
        System.out.println("New list after an existing element from the list was replaced by a new one: " +list);

        //Removing an element from the List
        list.remove(2);
        System.out.println("New list after the element was removed: " +list);
    }
}

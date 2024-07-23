import java.util.*;
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(112);
        list.add(2);
        list.add(215);
        list.add(12);
        list.add(-55);
        System.out.println("Original ArrayList " + list);  //reverse(list);
        Collections.sort(list); // Using java.util.Collections
        System.out.println("Sorted ArrayList in Ascending order: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted ArrayList in Ascending order: " + list);


    }
}
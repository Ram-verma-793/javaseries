import java.util.*;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Hello");
        l1.add("and");
        l1.add("welcome");
        l1.add("to");
        l1.add("java");
        l1.add("programming");

        System.out.println("original ArrayList" + l1);
        Collections.sort(l1);
        System.out.println("Ascending ArrayList" + l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Descending ArrayList" + l1);

    }
}

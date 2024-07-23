import java.util.ArrayList;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(12);
        l1.add(15);
        l1.add(256);
        System.out.println(l1);  //[1, 2, 12, 15, 256]

        //getting index item

        System.out.println(l1.get(2));//1

        // adding element to the index

        l1.add(0, 100);
        System.out.println(l1);

        // modifying element to the index

        l1.set(0, 200);
        System.out.println(l1);

        // removing element to the index

        l1.remove(0);
        System.out.println(l1);

        // removing element without knowing index

        l1.remove(Integer.valueOf(15));
        System.out.println(l1);

        //checking if element is present or not
        //returns boolean
        System.out.println(l1.contains(Integer.valueOf(12)));
        System.out.println(l1.contains(Integer.valueOf(112)));


        // In ArrayList we don't need to specify return value
        ArrayList l2 = new ArrayList();
        l2.add("RAM");
        l2.add(5);
        l2.add(true);
        System.out.println(l2);



    }
}

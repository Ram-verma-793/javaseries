import java.util.*;
public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(12);
        list.add(15);
        list.add(256);
        System.out.println("Original ArrayList " + list);
//        reverse(list);
        Collections.reverse(list); // Using java.util.Collections
        System.out.println("Reversed ArrayList: " +list);

    }
//    static void reverse(ArrayList<Integer> list){
//        int i=0;
//        int j= list.size()-1;
//        while(i<j){
//            Integer temp = list.get(i);
//            list.set(i, list.get(j));
//            list.set(j, temp);
//
//        i++;
//        j--;
//        }
//
//    }
}

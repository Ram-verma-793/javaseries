import java.util.*;

public class sortedArrayOfSquareElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Inputted array: ");
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Square of array elements: ");
        for (int i : array){
           i = i*i;
            System.out.print(i+ " ");
        }
    }

}
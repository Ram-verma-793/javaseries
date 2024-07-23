package printarray;

import java.util.Scanner;

public class printArray {
    public static void main(String[] args) {
        int[] arr = inputArray();
    }
    static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i< n; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }
    static void printArray(int[] array){
        for (int i=0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

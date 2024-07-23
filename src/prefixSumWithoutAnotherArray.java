import java.util.*;

public class prefixSumWithoutAnotherArray {
    public static void main(String[] args) {
        prefixSum();
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
    static void prefixSum(){
        int[] array = inputArray();
        int n= array.length;
        System.out.println("original array");
        for (int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        System.out.println("prefix sum array");
        for (int i=0; i<n;i++){
            if (i>=1){
                array[i] = array[i] + array[i - 1];
                System.out.print(array[i]+" ");
            }
            else System.out.print(array[i] + " ");
        }
    }
}

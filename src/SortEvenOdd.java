import java.util.*;
public class SortEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        for (int i=0;i<arraySize;i++){
            array[i] = sc.nextInt();
        }
        int left = 0;
        int right = arraySize - 1;

        while (left < right){
            if(array[left] %2 != 0 && array[right] %2 == 0) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;

            }
            if (array[left] % 2 == 0) {
                left++;
            }
            if (array[right] % 2== 1){
                right--;
            }
        }
        System.out.print("sorted array by parity : ");
        for (int i : array){
            System.out.print(i + " ");
        }
    }
}


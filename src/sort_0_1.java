import java.util.*;
public class sort_0_1 {
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
            if(array[left] == 1 && array[right] == 0) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;

            }
                if (array[left] == 0) {
                    left++;
                }
                if (array[right] == 1){
                    right--;
                }
        }
        System.out.print("sorted array : ");
            for (int i : array){
                System.out.print(i + " ");
            }
        }
    }


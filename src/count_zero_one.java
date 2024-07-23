import java.util.*;
public class count_zero_one {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length : ");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("Enter array elements");
        for (int i=0;i<arrayLength;i++){
            array[i] = sc.nextInt();
        }
        int zeroCount = count(array);
        for (int i=0;i<arrayLength;i++){
            if (i < zeroCount) array[i] = 0;
            else array[i] = 1;
        }
        System.out.println("sorted array");
        for (int i=0;i< arrayLength;i++){
            System.out.print(array[i] + " ");
        }
    }

    static int count(int[] array){

        int zero = 0;
        for (int i : array){
            if (i == 0) zero++;
        }
        return zero;

    }
}

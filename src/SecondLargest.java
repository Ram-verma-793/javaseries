import java.util.Scanner;

public class SecondLargest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = inputArr();
        int secondMaxValue = findSecondMax(arr);
        System.out.println("Second maximum value: " + secondMaxValue);
    }

    static int[] inputArr() {
        System.out.print("Enter size of array: ");
        int arraySize = sc.nextInt();
        int[] arr = new int[arraySize];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    static int findSecondMax(int[] arr) {
        int max = findMax(arr);
        int secondMax = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value != max && value > secondMax) {
                secondMax = value;
            }
        }
        return secondMax;
    }
}

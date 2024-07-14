import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        multiD();
        sum();
        inputArr();
    }
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    static void multiD() {
        int[][] multiDArray = {{10, 20, 30}, {5, 15, 25}, {1, 2, 3}};
        System.out.println("Using for loop:");
        for (int i = 0; i < multiDArray.length; i++) {
            for (int j = 0; j < multiDArray[i].length; j++) {
                System.out.print(multiDArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void sum() {
        int[] arr1 = {1, 2, 3, 12, 152};
        int sum = 0;
        for (int value : arr1) {
            sum += value;
        }
        System.out.println("Sum of arr1 elements: " + sum);
    }

    static void inputArr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int arrSize = sc.nextInt();
        int[] arr2 = new int[arrSize];
        System.out.println("Size of Array is " + arrSize);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr2[i] = sc.nextInt();
        }
        System.out.print("Array elements are: ");
        printArray(arr2);

        OptionalInt maxOptional = Arrays.stream(arr2).max();
        if (maxOptional.isPresent()) {
            int max = maxOptional.getAsInt();
            System.out.println("Maximum value of inputted Array is: " + max);
        } else {
            System.out.println("Array is empty");
        }

        OptionalInt minOptional = Arrays.stream(arr2).min();
        if (minOptional.isPresent()) {
            int min = minOptional.getAsInt();
            System.out.println("Minimum value of inputted Array is: " + min);
        } else {
            System.out.println("Array is empty");
        }

        int sum = Arrays.stream(arr2).sum();
        long count = Arrays.stream(arr2).count();
        OptionalDouble averageOfArray = Arrays.stream(arr2).average();
        OptionalInt first = Arrays.stream(arr2).findFirst();

        System.out.println("Sum of inputted Array is: " + sum);
        System.out.println("First element of inputted Array is: " + first.orElse(-1));
        System.out.println("Count of inputted Array is: " + count);
        System.out.println("Average of inputted Array is: " + averageOfArray.orElse(-1));
    }


}

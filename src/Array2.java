
import java.util.*;
public class Array2 {
    public static void main(String[] args) {
//        System.out.println("count : " + countOccurrencesOfValue());
//        System.out.println("count : " + lastOccurrencesOfValue());
//        System.out.println("count of strictly greater elements : " + strictlyGreaterElement());
//        System.out.println("is sorted " + sortedOrNot());
//        int[] result = smallestAndLargest();
//        System.out.println("Smallest and largest elements: " + Arrays.toString(result));


    }
    // Que. 1
    static int countOccurrencesOfValue(){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter size of array : ");
        int arraySize = sc.nextInt();
        int [] arr1 = new int[arraySize];
        System.out.print("Enter array elements : ");
        for (int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("enter value to find : ");
        int x = sc.nextInt();
        for (int value : arr1){
            if (value == x) count++;
        }
        return count;
    }

    // Que.2

    static int lastOccurrencesOfValue(){
        Scanner sc = new Scanner(System.in);
        int lastIndex = -1;
        System.out.print("Enter size of array : ");
        int arraySize = sc.nextInt();
        int [] arr2 = new int[arraySize];
        System.out.print("Enter array elements : ");
        for (int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }
        System.out.print("enter value to find last occur : ");
        int x = sc.nextInt();
        for (int i=0;i<arr2.length;i++){
            if (arr2[i] == x) lastIndex = i;
        }
        return lastIndex;
    }

    // Que. 3

    static int strictlyGreaterElement(){
        Scanner sc = new Scanner(System.in);
        int countIndex = 0;
        System.out.print("Enter size of array : ");
        int arraySize = sc.nextInt();
        int [] arr3 = new int[arraySize];
        System.out.print("Enter array elements : ");
        for (int i=0;i<arr3.length;i++){
            arr3[i] = sc.nextInt();
        }
        System.out.print("enter value : ");
        int x = sc.nextInt();
        for (int i=0;i<arr3.length;i++){
            if (x < arr3[i]) countIndex ++;
        }
        return countIndex;
    }

    // Que. 4

    static boolean sortedOrNot(){
        Scanner sc = new Scanner(System.in);
        boolean isSorted = true;
        System.out.print("Enter size of array : ");
        int arraySize = sc.nextInt();
        int [] arr4 = new int[arraySize];
        System.out.print("Enter array elements : ");
        for (int i=0;i<arr4.length;i++){
            arr4[i] = sc.nextInt();
        }
        for (int i=1;i<arr4.length;i++) {
            if (arr4[i] < arr4[i - 1]) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }


    // Que. 5

    static int[] smallestAndLargest() {
        Scanner sc = new Scanner(System.in);
        boolean isSorted = true;
        System.out.print("Enter size of array : ");
        int arraySize = sc.nextInt();
        int [] arr5 = new int[arraySize];
        System.out.print("Enter array elements : ");
        for (int i=0;i<arr5.length;i++){
            arr5[i] = sc.nextInt();
        }
        Arrays.sort(arr5);
        return new int[]{arr5[0], arr5[arr5.length - 1]};
    }





}

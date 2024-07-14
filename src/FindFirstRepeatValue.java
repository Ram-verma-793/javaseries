import java.util.Scanner;

public class FindFirstRepeatValue {
    public static void main(String[] args) {
        firstRepeat();
    }
    static int [] inputArr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int arraySize = sc.nextInt();
        int [] arr = new int[arraySize];
        System.out.print("Enter array elements : ");
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static void firstRepeat(){
        int[] arr = inputArr();
        for (int i=0; i<arr.length;i++){
           if (arr[i] == arr[i+1]){
               System.out.print("repeated value is :"+ arr[i]);
               break;
           }
        }

    }
}

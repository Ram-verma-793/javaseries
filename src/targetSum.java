import java.util.*;

public class targetSum {
    public static void main(String[] args) {
//        System.out.print("sum is : "+targetSum1());
//        System.out.print("sum is : "+targetSum2());
        System.out.println("unique value is "+findUnique());
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

    //// Que. 1

    static int targetSum1() {
        Scanner sc = new Scanner(System.in);
        int [] arr = inputArr();
        int pairCount = 0;
        System.out.print("enter target : ");
        int target = sc.nextInt();
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] + arr[j] == target)  pairCount++;
            }
        }
        return pairCount;
    }

//// Que. 2

    static int targetSum2() {
        Scanner sc = new Scanner(System.in);
        int tripleCount = 0;
        int [] arr = inputArr();
        System.out.print("enter target : ");
        int target = sc.nextInt();
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                for (int k=j+1;k<arr.length;k++){
                    if (arr[i] + arr[j] + arr[k] == target)  tripleCount++;
                }
            }
        }
        return tripleCount;
    }

//// Que. 2

    static int findUnique(){
        int [] array = inputArr();
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i] == array[j]){
                    array [i] = -1;
                    array [j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i=0;i<array.length;i++){
            if (array[i] > 0){
                ans = array [i];
            }
        }
        return ans;
    }



}

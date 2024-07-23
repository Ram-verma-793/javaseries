import java.util.*;
public class PrefixSum {
    public static void main(String[] args) {
        int[] array = printArray();
        int[] prefix = pref(array);
        System.out.println(Arrays.toString(prefix));
    }
    static int[] printArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        return array;
    }

    static int[] pref(int[] array){
        int n = array.length;
        int[] prefix = new int[n];
        prefix[0] = array[0];
        for (int i = 1;i < n; i++){
            prefix[i] = prefix[i - 1] + array[i];
        }
        return prefix;
    }


}

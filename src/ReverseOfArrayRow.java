import java.util.*;

public class ReverseOfArrayRow {
    public static void main(String [] args){
        int[][] array = printArray();
        reverse(array);
    }
    static int[][] printArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();
        int[][] array = new int[r][c];
        // Input array
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                array[i][j] = sc.nextInt();
            }
        }
        // Printing array
        System.out.println("Original array:");
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }
    // Reverse method
    static void reverse(int[][] array){
        int r = array.length;
        int c = array[0].length;
        System.out.println("Reversed array:");
        for (int i=r-1; i>=0; i--){
            for (int j=0; j<c; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        two_D();
    }
    static void two_D(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int r =sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int c =sc.nextInt();
        int [] [] array_2d = new int[r][c];
        System.out.println("Enter " + r*c + " elements: ");
        for (int i=0; i<r;i++){
            for (int j=0; j<c; j++){
                array_2d[i] [j] = sc.nextInt();
            }
        }

        System.out.println("2-D array");
        for (int i=0;i<array_2d.length;i++){
            for (int j=0;j<array_2d[i].length;j++){
                System.out.print(array_2d[i] [j] + " ");
            }
            System.out.println();
        }
    }

}



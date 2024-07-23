import java.util.*;
public class addTwoMatrices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows for matrix 1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter no. of columns for matrix 1: ");
        int c1 = sc.nextInt();
        int[][] mat1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter no. of rows for matrix 2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter no. of columns for matrix 2: ");
        int c2 = sc.nextInt();
        int[][] mat2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong input...");
            return;
        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("sum of matrices: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }

    }






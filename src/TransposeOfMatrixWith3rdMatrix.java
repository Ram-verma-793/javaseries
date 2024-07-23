import java.util.*;

public class TransposeOfMatrixWith3rdMatrix {
    public static void main(String[] args){
        printArray();
    }
    static void printArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows and columns of the matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] matrix = new int [r][c];
        System.out.println("Enter " + r*c + " elements: ");
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] transposedMatrix = new int[c][r];
        for (int i=0;i<r;i++){
            for (int j=i; j<c; j++){
                transposedMatrix[j][i] = matrix[i][j];


            }
        }
        System.out.println("Original matrix: ");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transposed matrix: ");
        for (int i = 0; i < c; i++){
            for (int j = 0; j < r; j++){
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}



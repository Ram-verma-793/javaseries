import java.util.*;

public class TransposeOfMatrixWithout3rdMatrix {
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
        for (int i=0;i<r;i++){
            for (int j=i; j<c; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        System.out.println("Transposed matrix: ");
        for (int i = 0; i < c; i++){
            for (int j = 0; j < r; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

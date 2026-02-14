package matrix;
import java.util.*;
public class matrix {

    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at index : (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static int findLargest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                largest = Math.max(largest, matrix[i][j]);
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 5);
        System.out.println("Largest Element in matrix is : " + findLargest(matrix));
    }
}

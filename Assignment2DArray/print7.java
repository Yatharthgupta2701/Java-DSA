package Assignment2DArray;
import java.util.*;
public class print7 {

    public static void printElement(int arr[][]){
        int num = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == 7){
                    num++;
                }
            }
        }
        System.out.println(num);
    }
    public static void main(String args[]){
        int arr[][] = {{4,7,8},
                        {8,8,7}};
        printElement(arr);
    }
}

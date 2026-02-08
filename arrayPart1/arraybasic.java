import java.util.*;
public class arraybasic {
    public static void main(String args[]){

        // Creating an Array :
        // For integer element :
        int nums[] = {1,2,3,4,5};
        System.out.println(nums[1]);
        // For character element :
        String fruits[] = {"mango", "apple", "orange"};
        System.out.println(fruits[2]);

        // Storing & retrieving element in an Array :
        int marks[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<=marks.length; i++){
            marks[i] = sc.nextInt();
        }
        System.out.println(marks[0]);

        

    }
}
